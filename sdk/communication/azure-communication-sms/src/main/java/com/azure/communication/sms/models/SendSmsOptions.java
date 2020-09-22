// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.sms.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SendSmsOptions model. */
@Fluent
public final class SendSmsOptions {
    /*
     * Enable this flag to receive a delivery report for this message on the
     * Azure Resource EventGrid
     */
    @JsonProperty(value = "enableDeliveryReport")
    private Boolean enableDeliveryReport;

    /**
     * Get the enableDeliveryReport property: Enable this flag to receive a delivery report for this message on the
     * Azure Resource EventGrid.
     *
     * @return the enableDeliveryReport value.
     */
    public Boolean isEnableDeliveryReport() {
        return this.enableDeliveryReport;
    }

    /**
     * Set the enableDeliveryReport property: Enable this flag to receive a delivery report for this message on the
     * Azure Resource EventGrid.
     *
     * @param enableDeliveryReport the enableDeliveryReport value to set.
     * @return the SendSmsOptions object itself.
     */
    public SendSmsOptions setEnableDeliveryReport(Boolean enableDeliveryReport) {
        this.enableDeliveryReport = enableDeliveryReport;
        return this;
    }
}
