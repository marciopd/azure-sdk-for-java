// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hdinsight.models.ClusterGetProperties;
import com.azure.resourcemanager.hdinsight.models.ClusterIdentity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The HDInsight cluster. */
@Fluent
public final class ClusterInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ClusterInner.class);

    /*
     * The ETag for the resource
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * The properties of the cluster.
     */
    @JsonProperty(value = "properties")
    private ClusterGetProperties properties;

    /*
     * The identity of the cluster, if configured.
     */
    @JsonProperty(value = "identity")
    private ClusterIdentity identity;

    /**
     * Get the etag property: The ETag for the resource.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: The ETag for the resource.
     *
     * @param etag the etag value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the properties property: The properties of the cluster.
     *
     * @return the properties value.
     */
    public ClusterGetProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties of the cluster.
     *
     * @param properties the properties value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withProperties(ClusterGetProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the identity property: The identity of the cluster, if configured.
     *
     * @return the identity value.
     */
    public ClusterIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the cluster, if configured.
     *
     * @param identity the identity value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withIdentity(ClusterIdentity identity) {
        this.identity = identity;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ClusterInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ClusterInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }
}
