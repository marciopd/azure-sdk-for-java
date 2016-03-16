/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.16.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.resources;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.resources.models.PageImpl;
import com.microsoft.azure.management.resources.models.ProviderOperationsMetadata;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;

/**
 * An instance of this class provides access to all the operations defined
 * in ProviderOperationsMetadataOperations.
 */
public interface ProviderOperationsMetadataOperations {
    /**
     * Gets provider operations metadata.
     *
     * @param resourceProviderNamespace Namespace of the resource provider.
     * @param apiVersion the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ProviderOperationsMetadata object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ProviderOperationsMetadata> get(String resourceProviderNamespace, String apiVersion) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets provider operations metadata.
     *
     * @param resourceProviderNamespace Namespace of the resource provider.
     * @param apiVersion the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAsync(String resourceProviderNamespace, String apiVersion, final ServiceCallback<ProviderOperationsMetadata> serviceCallback) throws IllegalArgumentException;
    /**
     * Gets provider operations metadata.
     *
     * @param resourceProviderNamespace Namespace of the resource provider.
     * @param apiVersion the String value
     * @param expand the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ProviderOperationsMetadata object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ProviderOperationsMetadata> get(String resourceProviderNamespace, String apiVersion, String expand) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets provider operations metadata.
     *
     * @param resourceProviderNamespace Namespace of the resource provider.
     * @param apiVersion the String value
     * @param expand the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAsync(String resourceProviderNamespace, String apiVersion, String expand, final ServiceCallback<ProviderOperationsMetadata> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets provider operations metadata list.
     *
     * @param apiVersion the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ProviderOperationsMetadata&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<ProviderOperationsMetadata>> list(final String apiVersion) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets provider operations metadata list.
     *
     * @param apiVersion the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAsync(final String apiVersion, final ListOperationCallback<ProviderOperationsMetadata> serviceCallback) throws IllegalArgumentException;
    /**
     * Gets provider operations metadata list.
     *
     * @param apiVersion the String value
     * @param expand the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ProviderOperationsMetadata&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<ProviderOperationsMetadata>> list(final String apiVersion, final String expand) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets provider operations metadata list.
     *
     * @param apiVersion the String value
     * @param expand the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAsync(final String apiVersion, final String expand, final ListOperationCallback<ProviderOperationsMetadata> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets provider operations metadata list.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ProviderOperationsMetadata&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<ProviderOperationsMetadata>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets provider operations metadata list.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<ProviderOperationsMetadata> serviceCallback) throws IllegalArgumentException;

}
