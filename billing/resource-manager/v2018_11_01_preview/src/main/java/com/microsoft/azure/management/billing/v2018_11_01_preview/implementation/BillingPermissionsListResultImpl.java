/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview.implementation;

import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingPermissionsListResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingPermissions;

class BillingPermissionsListResultImpl extends WrapperImpl<BillingPermissionsListResultInner> implements BillingPermissionsListResult {
    private final BillingManager manager;
    BillingPermissionsListResultImpl(BillingPermissionsListResultInner inner, BillingManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public BillingManager manager() {
        return this.manager;
    }

    @Override
    public List<BillingPermissions> value() {
        return this.inner().value();
    }

}
