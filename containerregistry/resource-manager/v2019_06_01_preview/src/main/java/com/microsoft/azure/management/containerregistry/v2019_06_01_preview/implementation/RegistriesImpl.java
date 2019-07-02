/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.containerregistry.v2019_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.containerregistry.v2019_06_01_preview.Registries;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.containerregistry.v2019_06_01_preview.Run;
import com.microsoft.azure.management.containerregistry.v2019_06_01_preview.SourceUploadDefinition;
import com.microsoft.azure.management.containerregistry.v2019_06_01_preview.RunRequest;

class RegistriesImpl extends WrapperImpl<RegistriesInner> implements Registries {
    private final ContainerRegistryManager manager;

    RegistriesImpl(ContainerRegistryManager manager) {
        super(manager.inner().registries());
        this.manager = manager;
    }

    public ContainerRegistryManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Run> scheduleRunAsync(String resourceGroupName, String registryName, RunRequest runRequest) {
        RegistriesInner client = this.inner();
        return client.scheduleRunAsync(resourceGroupName, registryName, runRequest)
        .map(new Func1<RunInner, Run>() {
            @Override
            public Run call(RunInner inner) {
                return new RunImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SourceUploadDefinition> getBuildSourceUploadUrlAsync(String resourceGroupName, String registryName) {
        RegistriesInner client = this.inner();
        return client.getBuildSourceUploadUrlAsync(resourceGroupName, registryName)
        .map(new Func1<SourceUploadDefinitionInner, SourceUploadDefinition>() {
            @Override
            public SourceUploadDefinition call(SourceUploadDefinitionInner inner) {
                return new SourceUploadDefinitionImpl(inner, manager());
            }
        });
    }

}
