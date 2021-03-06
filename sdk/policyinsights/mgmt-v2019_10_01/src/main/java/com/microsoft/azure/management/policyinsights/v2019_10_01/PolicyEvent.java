/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights.v2019_10_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.policyinsights.v2019_10_01.implementation.PolicyInsightsManager;
import com.microsoft.azure.management.policyinsights.v2019_10_01.implementation.PolicyEventInner;
import java.util.Map;
import java.util.List;
import org.joda.time.DateTime;

/**
 * Type representing PolicyEvent.
 */
public interface PolicyEvent extends HasInner<PolicyEventInner>, HasManager<PolicyInsightsManager> {
    /**
     * @return the additionalProperties value.
     */
    Map<String, Object> additionalProperties();

    /**
     * @return the complianceState value.
     */
    String complianceState();

    /**
     * @return the components value.
     */
    List<ComponentEventDetails> components();

    /**
     * @return the effectiveParameters value.
     */
    String effectiveParameters();

    /**
     * @return the isCompliant value.
     */
    Boolean isCompliant();

    /**
     * @return the managementGroupIds value.
     */
    String managementGroupIds();

    /**
     * @return the odatacontext value.
     */
    String odatacontext();

    /**
     * @return the odataid value.
     */
    String odataid();

    /**
     * @return the policyAssignmentId value.
     */
    String policyAssignmentId();

    /**
     * @return the policyAssignmentName value.
     */
    String policyAssignmentName();

    /**
     * @return the policyAssignmentOwner value.
     */
    String policyAssignmentOwner();

    /**
     * @return the policyAssignmentParameters value.
     */
    String policyAssignmentParameters();

    /**
     * @return the policyAssignmentScope value.
     */
    String policyAssignmentScope();

    /**
     * @return the policyDefinitionAction value.
     */
    String policyDefinitionAction();

    /**
     * @return the policyDefinitionCategory value.
     */
    String policyDefinitionCategory();

    /**
     * @return the policyDefinitionId value.
     */
    String policyDefinitionId();

    /**
     * @return the policyDefinitionName value.
     */
    String policyDefinitionName();

    /**
     * @return the policyDefinitionReferenceId value.
     */
    String policyDefinitionReferenceId();

    /**
     * @return the policySetDefinitionCategory value.
     */
    String policySetDefinitionCategory();

    /**
     * @return the policySetDefinitionId value.
     */
    String policySetDefinitionId();

    /**
     * @return the policySetDefinitionName value.
     */
    String policySetDefinitionName();

    /**
     * @return the policySetDefinitionOwner value.
     */
    String policySetDefinitionOwner();

    /**
     * @return the policySetDefinitionParameters value.
     */
    String policySetDefinitionParameters();

    /**
     * @return the principalOid value.
     */
    String principalOid();

    /**
     * @return the resourceGroup value.
     */
    String resourceGroup();

    /**
     * @return the resourceId value.
     */
    String resourceId();

    /**
     * @return the resourceLocation value.
     */
    String resourceLocation();

    /**
     * @return the resourceTags value.
     */
    String resourceTags();

    /**
     * @return the resourceType value.
     */
    String resourceType();

    /**
     * @return the subscriptionId value.
     */
    String subscriptionId();

    /**
     * @return the tenantId value.
     */
    String tenantId();

    /**
     * @return the timestamp value.
     */
    DateTime timestamp();

}
