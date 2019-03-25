/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview;

import rx.Observable;
import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.PolicyInner;
import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.PolicysInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Policys.
 */
public interface Policys extends HasInner<PolicysInner> {
    /**
     * The policy for a given billingAccountName and billingProfileName.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Policy> getByBillingProfileAsync(String billingAccountName, String billingProfileName);

    /**
     * The operation to update a policy.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param parameters Parameters supplied to the update policy operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Policy> updateAsync(String billingAccountName, String billingProfileName, PolicyInner parameters);

}
