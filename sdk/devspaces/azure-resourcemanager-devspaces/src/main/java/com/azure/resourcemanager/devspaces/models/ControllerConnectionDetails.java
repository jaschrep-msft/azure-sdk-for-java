// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devspaces.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ControllerConnectionDetails model. */
@Fluent
public final class ControllerConnectionDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ControllerConnectionDetails.class);

    /*
     * Base class for types that supply values used to connect to container
     * orchestrators
     */
    @JsonProperty(value = "orchestratorSpecificConnectionDetails")
    private OrchestratorSpecificConnectionDetails orchestratorSpecificConnectionDetails;

    /**
     * Get the orchestratorSpecificConnectionDetails property: Base class for types that supply values used to connect
     * to container orchestrators.
     *
     * @return the orchestratorSpecificConnectionDetails value.
     */
    public OrchestratorSpecificConnectionDetails orchestratorSpecificConnectionDetails() {
        return this.orchestratorSpecificConnectionDetails;
    }

    /**
     * Set the orchestratorSpecificConnectionDetails property: Base class for types that supply values used to connect
     * to container orchestrators.
     *
     * @param orchestratorSpecificConnectionDetails the orchestratorSpecificConnectionDetails value to set.
     * @return the ControllerConnectionDetails object itself.
     */
    public ControllerConnectionDetails withOrchestratorSpecificConnectionDetails(
        OrchestratorSpecificConnectionDetails orchestratorSpecificConnectionDetails) {
        this.orchestratorSpecificConnectionDetails = orchestratorSpecificConnectionDetails;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (orchestratorSpecificConnectionDetails() != null) {
            orchestratorSpecificConnectionDetails().validate();
        }
    }
}
