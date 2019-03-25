/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview;

import rx.Completable;
import rx.Observable;

/**
 * Type representing BillingAccountbillingRoleAssignments.
 */
public interface BillingAccountbillingRoleAssignments {
    /**
     * Get the role assignment for the caller.
     *
     * @param billingAccountName billing Account Id.
     * @param billingRoleAssignmentName role assignment id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleAssignment> getAsync(String billingAccountName, String billingRoleAssignmentName);

    /**
     * Delete the role assignment on this billing account.
     *
     * @param billingAccountName billing Account Id.
     * @param billingRoleAssignmentName role assignment id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleAssignment> deleteAsync(String billingAccountName, String billingRoleAssignmentName);

    /**
     * Get the role assignments on the Billing Account.
     *
     * @param billingAccountName billing Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleAssignmentListResult> listAsync(String billingAccountName);

    /**
     * The operation to add a role assignment to a billing account.
     *
     * @param billingAccountName billing Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleAssignmentListResult> addAsync(String billingAccountName);

}
