/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_02_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2019_02_01.InterfaceEndpoint;
import rx.Observable;
import com.microsoft.azure.management.network.v2019_02_01.EndpointService;
import java.util.List;
import java.util.ArrayList;
import com.microsoft.azure.management.network.v2019_02_01.NetworkInterface;
import com.microsoft.azure.management.network.v2019_02_01.Subnet;

class InterfaceEndpointImpl extends GroupableResourceCoreImpl<InterfaceEndpoint, InterfaceEndpointInner, InterfaceEndpointImpl, NetworkManager> implements InterfaceEndpoint, InterfaceEndpoint.Definition, InterfaceEndpoint.Update {
    InterfaceEndpointImpl(String name, InterfaceEndpointInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<InterfaceEndpoint> createResourceAsync() {
        InterfaceEndpointsInner client = this.manager().inner().interfaceEndpoints();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<InterfaceEndpoint> updateResourceAsync() {
        InterfaceEndpointsInner client = this.manager().inner().interfaceEndpoints();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<InterfaceEndpointInner> getInnerAsync() {
        InterfaceEndpointsInner client = this.manager().inner().interfaceEndpoints();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public EndpointService endpointService() {
        return this.inner().endpointService();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String fqdn() {
        return this.inner().fqdn();
    }

    @Override
    public List<NetworkInterface> networkInterfaces() {
        List<NetworkInterface> lst = new ArrayList<NetworkInterface>();
        if (this.inner().networkInterfaces() != null) {
            for (NetworkInterfaceInner inner : this.inner().networkInterfaces()) {
                lst.add( new NetworkInterfaceImpl(inner.name(), inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public String owner() {
        return this.inner().owner();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public Subnet subnet() {
        SubnetInner inner = this.inner().subnet();
        if (inner != null) {
            return  new SubnetImpl(inner, manager());
        } else {
            return null;
        }
    }

    @Override
    public InterfaceEndpointImpl withEndpointService(EndpointService endpointService) {
        this.inner().withEndpointService(endpointService);
        return this;
    }

    @Override
    public InterfaceEndpointImpl withEtag(String etag) {
        this.inner().withEtag(etag);
        return this;
    }

    @Override
    public InterfaceEndpointImpl withFqdn(String fqdn) {
        this.inner().withFqdn(fqdn);
        return this;
    }

    @Override
    public InterfaceEndpointImpl withSubnet(SubnetInner subnet) {
        this.inner().withSubnet(subnet);
        return this;
    }

}
