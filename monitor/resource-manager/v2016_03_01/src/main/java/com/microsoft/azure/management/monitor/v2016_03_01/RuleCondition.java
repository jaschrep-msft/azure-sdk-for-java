/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2016_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The condition that results in the alert rule being activated.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "odata.type")
@JsonTypeName("RuleCondition")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Microsoft.Azure.Management.Insights.Models.ThresholdRuleCondition", value = ThresholdRuleCondition.class),
    @JsonSubTypes.Type(name = "Microsoft.Azure.Management.Insights.Models.LocationThresholdRuleCondition", value = LocationThresholdRuleCondition.class),
    @JsonSubTypes.Type(name = "Microsoft.Azure.Management.Insights.Models.ManagementEventRuleCondition", value = ManagementEventRuleCondition.class)
})
public class RuleCondition {
    /**
     * the resource from which the rule collects its data. For this type
     * dataSource will always be of type RuleMetricDataSource.
     */
    @JsonProperty(value = "dataSource")
    private RuleDataSource dataSource;

    /**
     * Get the resource from which the rule collects its data. For this type dataSource will always be of type RuleMetricDataSource.
     *
     * @return the dataSource value
     */
    public RuleDataSource dataSource() {
        return this.dataSource;
    }

    /**
     * Set the resource from which the rule collects its data. For this type dataSource will always be of type RuleMetricDataSource.
     *
     * @param dataSource the dataSource value to set
     * @return the RuleCondition object itself.
     */
    public RuleCondition withDataSource(RuleDataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }

}
