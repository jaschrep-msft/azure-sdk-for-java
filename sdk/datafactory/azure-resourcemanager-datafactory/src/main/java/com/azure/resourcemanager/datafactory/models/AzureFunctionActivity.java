// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Azure Function activity. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureFunctionActivity")
@JsonFlatten
@Fluent
public class AzureFunctionActivity extends ExecutionActivity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureFunctionActivity.class);

    /*
     * Rest API method for target endpoint.
     */
    @JsonProperty(value = "typeProperties.method", required = true)
    private AzureFunctionActivityMethod method;

    /*
     * Name of the Function that the Azure Function Activity will call. Type:
     * string (or Expression with resultType string)
     */
    @JsonProperty(value = "typeProperties.functionName", required = true)
    private Object functionName;

    /*
     * Represents the headers that will be sent to the request. For example, to
     * set the language and type on a request: "headers" : { "Accept-Language":
     * "en-us", "Content-Type": "application/json" }. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.headers")
    private Object headers;

    /*
     * Represents the payload that will be sent to the endpoint. Required for
     * POST/PUT method, not allowed for GET method Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "typeProperties.body")
    private Object body;

    /**
     * Get the method property: Rest API method for target endpoint.
     *
     * @return the method value.
     */
    public AzureFunctionActivityMethod method() {
        return this.method;
    }

    /**
     * Set the method property: Rest API method for target endpoint.
     *
     * @param method the method value to set.
     * @return the AzureFunctionActivity object itself.
     */
    public AzureFunctionActivity withMethod(AzureFunctionActivityMethod method) {
        this.method = method;
        return this;
    }

    /**
     * Get the functionName property: Name of the Function that the Azure Function Activity will call. Type: string (or
     * Expression with resultType string).
     *
     * @return the functionName value.
     */
    public Object functionName() {
        return this.functionName;
    }

    /**
     * Set the functionName property: Name of the Function that the Azure Function Activity will call. Type: string (or
     * Expression with resultType string).
     *
     * @param functionName the functionName value to set.
     * @return the AzureFunctionActivity object itself.
     */
    public AzureFunctionActivity withFunctionName(Object functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * Get the headers property: Represents the headers that will be sent to the request. For example, to set the
     * language and type on a request: "headers" : { "Accept-Language": "en-us", "Content-Type": "application/json" }.
     * Type: string (or Expression with resultType string).
     *
     * @return the headers value.
     */
    public Object headers() {
        return this.headers;
    }

    /**
     * Set the headers property: Represents the headers that will be sent to the request. For example, to set the
     * language and type on a request: "headers" : { "Accept-Language": "en-us", "Content-Type": "application/json" }.
     * Type: string (or Expression with resultType string).
     *
     * @param headers the headers value to set.
     * @return the AzureFunctionActivity object itself.
     */
    public AzureFunctionActivity withHeaders(Object headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Get the body property: Represents the payload that will be sent to the endpoint. Required for POST/PUT method,
     * not allowed for GET method Type: string (or Expression with resultType string).
     *
     * @return the body value.
     */
    public Object body() {
        return this.body;
    }

    /**
     * Set the body property: Represents the payload that will be sent to the endpoint. Required for POST/PUT method,
     * not allowed for GET method Type: string (or Expression with resultType string).
     *
     * @param body the body value to set.
     * @return the AzureFunctionActivity object itself.
     */
    public AzureFunctionActivity withBody(Object body) {
        this.body = body;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureFunctionActivity withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureFunctionActivity withPolicy(ActivityPolicy policy) {
        super.withPolicy(policy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureFunctionActivity withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureFunctionActivity withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureFunctionActivity withDependsOn(List<ActivityDependency> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureFunctionActivity withUserProperties(List<UserProperty> userProperties) {
        super.withUserProperties(userProperties);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (method() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property method in model AzureFunctionActivity"));
        }
        if (functionName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property functionName in model AzureFunctionActivity"));
        }
    }
}
