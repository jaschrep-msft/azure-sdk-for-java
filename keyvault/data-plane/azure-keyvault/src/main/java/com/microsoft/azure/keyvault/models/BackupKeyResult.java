// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.keyvault.models;

import com.microsoft.rest.Base64Url;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The backup key result, containing the backup blob.
 */
public class BackupKeyResult {
    /**
     * The backup blob containing the backed up key.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private Base64Url value;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public byte[] value() {
        if (this.value == null) {
            return null;
        }
        return this.value.decodedBytes();
    }

}
