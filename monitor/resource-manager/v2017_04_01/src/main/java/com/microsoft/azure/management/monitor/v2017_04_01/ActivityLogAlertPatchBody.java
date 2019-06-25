/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2017_04_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * An activity log alert object for the body of patch operations.
 */
@JsonFlatten
public class ActivityLogAlertPatchBody {
    /**
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Indicates whether this activity log alert is enabled. If an activity log
     * alert is not enabled, then none of its actions will be activated.
     */
    @JsonProperty(value = "properties.enabled")
    private Boolean enabled;

    /**
     * Get resource tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set resource tags.
     *
     * @param tags the tags value to set
     * @return the ActivityLogAlertPatchBody object itself.
     */
    public ActivityLogAlertPatchBody withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get indicates whether this activity log alert is enabled. If an activity log alert is not enabled, then none of its actions will be activated.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set indicates whether this activity log alert is enabled. If an activity log alert is not enabled, then none of its actions will be activated.
     *
     * @param enabled the enabled value to set
     * @return the ActivityLogAlertPatchBody object itself.
     */
    public ActivityLogAlertPatchBody withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

}
