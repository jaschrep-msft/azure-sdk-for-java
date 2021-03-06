/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhubs.v2018_01_01_preview.implementation;

import com.microsoft.azure.management.eventhubs.v2018_01_01_preview.MessagingRegionsProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Messaging Region.
 */
@SkipParentValidation
public class MessagingRegionsInner extends Resource {
    /**
     * Properties of Messaging Region.
     */
    @JsonProperty(value = "properties")
    private MessagingRegionsProperties properties;

    /**
     * Get properties of Messaging Region.
     *
     * @return the properties value
     */
    public MessagingRegionsProperties properties() {
        return this.properties;
    }

    /**
     * Set properties of Messaging Region.
     *
     * @param properties the properties value to set
     * @return the MessagingRegionsInner object itself.
     */
    public MessagingRegionsInner withProperties(MessagingRegionsProperties properties) {
        this.properties = properties;
        return this;
    }

}
