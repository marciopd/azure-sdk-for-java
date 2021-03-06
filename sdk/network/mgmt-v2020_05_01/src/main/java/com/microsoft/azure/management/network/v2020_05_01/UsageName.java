/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The usage names.
 */
public class UsageName {
    /**
     * A string describing the resource name.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * A localized string describing the resource name.
     */
    @JsonProperty(value = "localizedValue")
    private String localizedValue;

    /**
     * Get a string describing the resource name.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set a string describing the resource name.
     *
     * @param value the value value to set
     * @return the UsageName object itself.
     */
    public UsageName withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get a localized string describing the resource name.
     *
     * @return the localizedValue value
     */
    public String localizedValue() {
        return this.localizedValue;
    }

    /**
     * Set a localized string describing the resource name.
     *
     * @param localizedValue the localizedValue value to set
     * @return the UsageName object itself.
     */
    public UsageName withLocalizedValue(String localizedValue) {
        this.localizedValue = localizedValue;
        return this;
    }

}
