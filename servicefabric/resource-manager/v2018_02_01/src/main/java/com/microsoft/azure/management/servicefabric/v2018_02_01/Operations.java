/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric.v2018_02_01;

import rx.Observable;
import com.microsoft.azure.management.servicefabric.v2018_02_01.implementation.OperationsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Operations.
 */
public interface Operations extends HasInner<OperationsInner> {
    /**
     * Lists all of the available Service Fabric resource provider API operations.
     * Get the list of available Service Fabric resource provider API operations.
     *
     * @param apiVersion The version of the Service Fabric resource provider API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<OperationResult> listAsync(final String apiVersion);

}
