package com.microsoft.azure.sevicebus.security;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.microsoft.aad.adal4j.AsymmetricKeyCredential;
import com.microsoft.aad.adal4j.AuthenticationCallback;
import com.microsoft.aad.adal4j.AuthenticationContext;
import com.microsoft.aad.adal4j.AuthenticationResult;
import com.microsoft.aad.adal4j.ClientCredential;

public class AzureActiveDirectoryTokenProvider extends TokenProvider
{
    private static final Logger TRACE_LOGGER = LoggerFactory.getLogger(AzureActiveDirectoryTokenProvider.class);
    
    enum AuthenticationMode
    {
        CLIENT_CREDENTIAL,
        USER_PASSWORD_CREDENTIAL,
        CERTIFICATE
    }
    
    private AuthenticationMode authenticationMode;
    private AuthenticationContext authenticationContext;
    private ClientCredential clientCredential;
    private AsymmetricKeyCredential asymmetricKeyCredential;
    private String clientId;
    private String userName;
    private String password;
    
    public AzureActiveDirectoryTokenProvider(AuthenticationContext authenticationContext, ClientCredential clientCredential)
    {
        this.authenticationMode = AuthenticationMode.CLIENT_CREDENTIAL;
        this.authenticationContext = authenticationContext;
        this.clientCredential = clientCredential;
    }
    
    public AzureActiveDirectoryTokenProvider(AuthenticationContext authenticationContext, AsymmetricKeyCredential asymmetricKeyCredential)
    {
        this.authenticationMode = AuthenticationMode.CERTIFICATE;
        this.authenticationContext = authenticationContext;
        this.asymmetricKeyCredential = asymmetricKeyCredential;
    }
    
    public AzureActiveDirectoryTokenProvider(AuthenticationContext authenticationContext, String clientId, String userName, String password)
    {
        this.authenticationMode = AuthenticationMode.USER_PASSWORD_CREDENTIAL;
        this.authenticationContext = authenticationContext;
        this.clientId = clientId;
        this.userName = userName;
        this.password = password;
    }

    @Override
    public CompletableFuture<SecurityToken> getSecurityTokenAsync(String audience) {
        String addAudienceForSB = SecurityConstants.SERVICEBUS_AAD_AUDIENCE_RESOURCE_URL;
        CompletableFuture<SecurityToken> tokenGeneratingFuture = new CompletableFuture<>();
        switch(this.authenticationMode)
        {
            case CLIENT_CREDENTIAL:
                this.authenticationContext.acquireToken(addAudienceForSB, this.clientCredential, new FutureCompletingAuthenticationCallback(tokenGeneratingFuture, audience));
                break;
            case USER_PASSWORD_CREDENTIAL:
                this.authenticationContext.acquireToken(addAudienceForSB, this.clientId, this.userName, this.password, new FutureCompletingAuthenticationCallback(tokenGeneratingFuture, audience));
                break;
            case CERTIFICATE:
                this.authenticationContext.acquireToken(addAudienceForSB, this.asymmetricKeyCredential, new FutureCompletingAuthenticationCallback(tokenGeneratingFuture, audience));
                break;
        }
        return tokenGeneratingFuture;
    }
    
    private static class FutureCompletingAuthenticationCallback implements AuthenticationCallback
    {
        private CompletableFuture<SecurityToken> tokenGeneratingFutue;
        private String audience;
        
        public FutureCompletingAuthenticationCallback(CompletableFuture<SecurityToken> tokenGeneratingFutue, String audience)
        {
            this.tokenGeneratingFutue = tokenGeneratingFutue;
            this.audience = audience;
        }
        
        @Override
        public void onFailure(Throwable authException) {
            TRACE_LOGGER.error("Getting token from Azure Active Directory failed", authException);
            this.tokenGeneratingFutue.completeExceptionally(authException);
        }

        @Override
        public void onSuccess(AuthenticationResult authResult) {
            SecurityToken generatedToken = new SecurityToken(SecurityTokenType.JWT, this.audience, authResult.getAccessToken(), Instant.now(), Instant.now().plus(Duration.ofSeconds(authResult.getExpiresAfter())));
            tokenGeneratingFutue.complete(generatedToken);
        }
        
    }
}
