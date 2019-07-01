/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.relay.v2017_04_01.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.relay.v2017_04_01.Relaytype;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Description of the WCF relay resource.
 */
@JsonFlatten
public class WcfRelayInner extends ProxyResource {
    /**
     * Returns true if the relay is dynamic; otherwise, false.
     */
    @JsonProperty(value = "properties.isDynamic", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isDynamic;

    /**
     * The time the WCF relay was created.
     */
    @JsonProperty(value = "properties.createdAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdAt;

    /**
     * The time the namespace was updated.
     */
    @JsonProperty(value = "properties.updatedAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime updatedAt;

    /**
     * The number of listeners for this relay. Note that min :1 and max:25 are
     * supported.
     */
    @JsonProperty(value = "properties.listenerCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer listenerCount;

    /**
     * WCF relay type. Possible values include: 'NetTcp', 'Http'.
     */
    @JsonProperty(value = "properties.relayType")
    private Relaytype relayType;

    /**
     * Returns true if client authorization is needed for this relay;
     * otherwise, false.
     */
    @JsonProperty(value = "properties.requiresClientAuthorization")
    private Boolean requiresClientAuthorization;

    /**
     * Returns true if transport security is needed for this relay; otherwise,
     * false.
     */
    @JsonProperty(value = "properties.requiresTransportSecurity")
    private Boolean requiresTransportSecurity;

    /**
     * The usermetadata is a placeholder to store user-defined string data for
     * the WCF Relay endpoint. For example, it can be used to store descriptive
     * data, such as list of teams and their contact information. Also,
     * user-defined configuration settings can be stored.
     */
    @JsonProperty(value = "properties.userMetadata")
    private String userMetadata;

    /**
     * Get returns true if the relay is dynamic; otherwise, false.
     *
     * @return the isDynamic value
     */
    public Boolean isDynamic() {
        return this.isDynamic;
    }

    /**
     * Get the time the WCF relay was created.
     *
     * @return the createdAt value
     */
    public DateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Get the time the namespace was updated.
     *
     * @return the updatedAt value
     */
    public DateTime updatedAt() {
        return this.updatedAt;
    }

    /**
     * Get the number of listeners for this relay. Note that min :1 and max:25 are supported.
     *
     * @return the listenerCount value
     */
    public Integer listenerCount() {
        return this.listenerCount;
    }

    /**
     * Get wCF relay type. Possible values include: 'NetTcp', 'Http'.
     *
     * @return the relayType value
     */
    public Relaytype relayType() {
        return this.relayType;
    }

    /**
     * Set wCF relay type. Possible values include: 'NetTcp', 'Http'.
     *
     * @param relayType the relayType value to set
     * @return the WcfRelayInner object itself.
     */
    public WcfRelayInner withRelayType(Relaytype relayType) {
        this.relayType = relayType;
        return this;
    }

    /**
     * Get returns true if client authorization is needed for this relay; otherwise, false.
     *
     * @return the requiresClientAuthorization value
     */
    public Boolean requiresClientAuthorization() {
        return this.requiresClientAuthorization;
    }

    /**
     * Set returns true if client authorization is needed for this relay; otherwise, false.
     *
     * @param requiresClientAuthorization the requiresClientAuthorization value to set
     * @return the WcfRelayInner object itself.
     */
    public WcfRelayInner withRequiresClientAuthorization(Boolean requiresClientAuthorization) {
        this.requiresClientAuthorization = requiresClientAuthorization;
        return this;
    }

    /**
     * Get returns true if transport security is needed for this relay; otherwise, false.
     *
     * @return the requiresTransportSecurity value
     */
    public Boolean requiresTransportSecurity() {
        return this.requiresTransportSecurity;
    }

    /**
     * Set returns true if transport security is needed for this relay; otherwise, false.
     *
     * @param requiresTransportSecurity the requiresTransportSecurity value to set
     * @return the WcfRelayInner object itself.
     */
    public WcfRelayInner withRequiresTransportSecurity(Boolean requiresTransportSecurity) {
        this.requiresTransportSecurity = requiresTransportSecurity;
        return this;
    }

    /**
     * Get the usermetadata is a placeholder to store user-defined string data for the WCF Relay endpoint. For example, it can be used to store descriptive data, such as list of teams and their contact information. Also, user-defined configuration settings can be stored.
     *
     * @return the userMetadata value
     */
    public String userMetadata() {
        return this.userMetadata;
    }

    /**
     * Set the usermetadata is a placeholder to store user-defined string data for the WCF Relay endpoint. For example, it can be used to store descriptive data, such as list of teams and their contact information. Also, user-defined configuration settings can be stored.
     *
     * @param userMetadata the userMetadata value to set
     * @return the WcfRelayInner object itself.
     */
    public WcfRelayInner withUserMetadata(String userMetadata) {
        this.userMetadata = userMetadata;
        return this;
    }

}
