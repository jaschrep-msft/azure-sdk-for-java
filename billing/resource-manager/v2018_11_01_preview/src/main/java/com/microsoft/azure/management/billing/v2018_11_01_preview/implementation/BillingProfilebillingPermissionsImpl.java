/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingProfilebillingPermissions;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingPermissionsListResult;

class BillingProfilebillingPermissionsImpl extends WrapperImpl<BillingProfilebillingPermissionsInner> implements BillingProfilebillingPermissions {
    private final BillingManager manager;

    BillingProfilebillingPermissionsImpl(BillingManager manager) {
        super(manager.inner().billingProfilebillingPermissions());
        this.manager = manager;
    }

    public BillingManager manager() {
        return this.manager;
    }

    @Override
    public Observable<BillingPermissionsListResult> listAsync(String billingAccountName, String billingProfileName) {
        BillingProfilebillingPermissionsInner client = this.inner();
        return client.listAsync(billingAccountName, billingProfileName)
        .map(new Func1<BillingPermissionsListResultInner, BillingPermissionsListResult>() {
            @Override
            public BillingPermissionsListResult call(BillingPermissionsListResultInner inner) {
                return new BillingPermissionsListResultImpl(inner, manager());
            }
        });
    }

}
