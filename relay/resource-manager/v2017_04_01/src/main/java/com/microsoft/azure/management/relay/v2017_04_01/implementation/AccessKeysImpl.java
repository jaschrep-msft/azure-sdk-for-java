/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.relay.v2017_04_01.implementation;

import com.microsoft.azure.management.relay.v2017_04_01.AccessKeys;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class AccessKeysImpl extends WrapperImpl<AccessKeysInner> implements AccessKeys {
    private final RelayManager manager;
    AccessKeysImpl(AccessKeysInner inner, RelayManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public RelayManager manager() {
        return this.manager;
    }

    @Override
    public String keyName() {
        return this.inner().keyName();
    }

    @Override
    public String primaryConnectionString() {
        return this.inner().primaryConnectionString();
    }

    @Override
    public String primaryKey() {
        return this.inner().primaryKey();
    }

    @Override
    public String secondaryConnectionString() {
        return this.inner().secondaryConnectionString();
    }

    @Override
    public String secondaryKey() {
        return this.inner().secondaryKey();
    }

}
