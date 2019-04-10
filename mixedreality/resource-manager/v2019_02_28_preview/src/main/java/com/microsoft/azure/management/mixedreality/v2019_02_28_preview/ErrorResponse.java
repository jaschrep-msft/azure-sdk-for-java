/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mixedreality.v2019_02_28_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response on Error.
 */
public class ErrorResponse {
    /**
     * Describes the error in detail and provides debugging information.
     */
    @JsonProperty(value = "message", required = true)
    private String message;

    /**
     * String that can be used to programmatically identify the error.
     */
    @JsonProperty(value = "code", required = true)
    private String code;

    /**
     * The target of the particular error.
     */
    @JsonProperty(value = "target")
    private String target;

    /**
     * An array of JSON objects that MUST contain name/value pairs for code and
     * message, and MAY contain a name/value pair for target, as described
     * above.The contents of this section are service-defined but must adhere
     * to the aforementioned schema.
     */
    @JsonProperty(value = "details")
    private String details;

    /**
     * Get describes the error in detail and provides debugging information.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set describes the error in detail and provides debugging information.
     *
     * @param message the message value to set
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get string that can be used to programmatically identify the error.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set string that can be used to programmatically identify the error.
     *
     * @param code the code value to set
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the target of the particular error.
     *
     * @return the target value
     */
    public String target() {
        return this.target;
    }

    /**
     * Set the target of the particular error.
     *
     * @param target the target value to set
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get an array of JSON objects that MUST contain name/value pairs for code and message, and MAY contain a name/value pair for target, as described above.The contents of this section are service-defined but must adhere to the aforementioned schema.
     *
     * @return the details value
     */
    public String details() {
        return this.details;
    }

    /**
     * Set an array of JSON objects that MUST contain name/value pairs for code and message, and MAY contain a name/value pair for target, as described above.The contents of this section are service-defined but must adhere to the aforementioned schema.
     *
     * @param details the details value to set
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse withDetails(String details) {
        this.details = details;
        return this;
    }

}
