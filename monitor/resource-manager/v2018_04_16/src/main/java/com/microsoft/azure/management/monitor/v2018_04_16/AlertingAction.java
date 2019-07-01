/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2018_04_16;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Specify action need to be taken when rule type is Alert.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "odata.type")
@JsonTypeName("Microsoft.WindowsAzure.Management.Monitoring.Alerts.Models.Microsoft.AppInsights.Nexus.DataContracts.Resources.ScheduledQueryRules.AlertingAction")
public class AlertingAction extends Action {
    /**
     * Severity of the alert. Possible values include: '0', '1', '2', '3', '4'.
     */
    @JsonProperty(value = "severity", required = true)
    private AlertSeverity severity;

    /**
     * Azure action group reference.
     */
    @JsonProperty(value = "aznsAction")
    private AzNsActionGroup aznsAction;

    /**
     * time (in minutes) for which Alerts should be throttled or suppressed.
     */
    @JsonProperty(value = "throttlingInMin")
    private Integer throttlingInMin;

    /**
     * The trigger condition that results in the alert rule being.
     */
    @JsonProperty(value = "trigger", required = true)
    private TriggerCondition trigger;

    /**
     * Get severity of the alert. Possible values include: '0', '1', '2', '3', '4'.
     *
     * @return the severity value
     */
    public AlertSeverity severity() {
        return this.severity;
    }

    /**
     * Set severity of the alert. Possible values include: '0', '1', '2', '3', '4'.
     *
     * @param severity the severity value to set
     * @return the AlertingAction object itself.
     */
    public AlertingAction withSeverity(AlertSeverity severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Get azure action group reference.
     *
     * @return the aznsAction value
     */
    public AzNsActionGroup aznsAction() {
        return this.aznsAction;
    }

    /**
     * Set azure action group reference.
     *
     * @param aznsAction the aznsAction value to set
     * @return the AlertingAction object itself.
     */
    public AlertingAction withAznsAction(AzNsActionGroup aznsAction) {
        this.aznsAction = aznsAction;
        return this;
    }

    /**
     * Get time (in minutes) for which Alerts should be throttled or suppressed.
     *
     * @return the throttlingInMin value
     */
    public Integer throttlingInMin() {
        return this.throttlingInMin;
    }

    /**
     * Set time (in minutes) for which Alerts should be throttled or suppressed.
     *
     * @param throttlingInMin the throttlingInMin value to set
     * @return the AlertingAction object itself.
     */
    public AlertingAction withThrottlingInMin(Integer throttlingInMin) {
        this.throttlingInMin = throttlingInMin;
        return this;
    }

    /**
     * Get the trigger condition that results in the alert rule being.
     *
     * @return the trigger value
     */
    public TriggerCondition trigger() {
        return this.trigger;
    }

    /**
     * Set the trigger condition that results in the alert rule being.
     *
     * @param trigger the trigger value to set
     * @return the AlertingAction object itself.
     */
    public AlertingAction withTrigger(TriggerCondition trigger) {
        this.trigger = trigger;
        return this;
    }

}
