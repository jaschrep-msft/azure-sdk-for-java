/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric.v2018_02_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a node type in the cluster, each node type represents sub set of
 * nodes in the cluster.
 */
public class NodeTypeDescription {
    /**
     * The name of the node type.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The placement tags applied to nodes in the node type, which can be used
     * to indicate where certain services (workload) should run.
     */
    @JsonProperty(value = "placementProperties")
    private Map<String, String> placementProperties;

    /**
     * The capacity tags applied to the nodes in the node type, the cluster
     * resource manager uses these tags to understand how much resource a node
     * has.
     */
    @JsonProperty(value = "capacities")
    private Map<String, String> capacities;

    /**
     * The TCP cluster management endpoint port.
     */
    @JsonProperty(value = "clientConnectionEndpointPort", required = true)
    private int clientConnectionEndpointPort;

    /**
     * The HTTP cluster management endpoint port.
     */
    @JsonProperty(value = "httpGatewayEndpointPort", required = true)
    private int httpGatewayEndpointPort;

    /**
     * The durability level of the node type. Learn about
     * [DurabilityLevel](https://docs.microsoft.com/en-us/azure/service-fabric/service-fabric-cluster-capacity).
     *
     * - Bronze - No privileges. This is the default.
     * - Silver - The infrastructure jobs can be paused for a duration of 10
     * minutes per UD.
     * - Gold - The infrastructure jobs can be paused for a duration of 2 hours
     * per UD. Gold durability can be enabled only on full node VM SKUs like
     * D15_V2, G5 etc.
     * . Possible values include: 'Bronze', 'Silver', 'Gold'.
     */
    @JsonProperty(value = "durabilityLevel")
    private String durabilityLevel;

    /**
     * The range of ports from which cluster assigned port to Service Fabric
     * applications.
     */
    @JsonProperty(value = "applicationPorts")
    private EndpointRangeDescription applicationPorts;

    /**
     * The range of ephemeral ports that nodes in this node type should be
     * configured with.
     */
    @JsonProperty(value = "ephemeralPorts")
    private EndpointRangeDescription ephemeralPorts;

    /**
     * The node type on which system services will run. Only one node type
     * should be marked as primary. Primary node type cannot be deleted or
     * changed for existing clusters.
     */
    @JsonProperty(value = "isPrimary", required = true)
    private boolean isPrimary;

    /**
     * The number of nodes in the node type. This count should match the
     * capacity property in the corresponding VirtualMachineScaleSet resource.
     */
    @JsonProperty(value = "vmInstanceCount", required = true)
    private int vmInstanceCount;

    /**
     * The endpoint used by reverse proxy.
     */
    @JsonProperty(value = "reverseProxyEndpointPort")
    private Integer reverseProxyEndpointPort;

    /**
     * Get the name of the node type.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the node type.
     *
     * @param name the name value to set
     * @return the NodeTypeDescription object itself.
     */
    public NodeTypeDescription withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the placement tags applied to nodes in the node type, which can be used to indicate where certain services (workload) should run.
     *
     * @return the placementProperties value
     */
    public Map<String, String> placementProperties() {
        return this.placementProperties;
    }

    /**
     * Set the placement tags applied to nodes in the node type, which can be used to indicate where certain services (workload) should run.
     *
     * @param placementProperties the placementProperties value to set
     * @return the NodeTypeDescription object itself.
     */
    public NodeTypeDescription withPlacementProperties(Map<String, String> placementProperties) {
        this.placementProperties = placementProperties;
        return this;
    }

    /**
     * Get the capacity tags applied to the nodes in the node type, the cluster resource manager uses these tags to understand how much resource a node has.
     *
     * @return the capacities value
     */
    public Map<String, String> capacities() {
        return this.capacities;
    }

    /**
     * Set the capacity tags applied to the nodes in the node type, the cluster resource manager uses these tags to understand how much resource a node has.
     *
     * @param capacities the capacities value to set
     * @return the NodeTypeDescription object itself.
     */
    public NodeTypeDescription withCapacities(Map<String, String> capacities) {
        this.capacities = capacities;
        return this;
    }

    /**
     * Get the TCP cluster management endpoint port.
     *
     * @return the clientConnectionEndpointPort value
     */
    public int clientConnectionEndpointPort() {
        return this.clientConnectionEndpointPort;
    }

    /**
     * Set the TCP cluster management endpoint port.
     *
     * @param clientConnectionEndpointPort the clientConnectionEndpointPort value to set
     * @return the NodeTypeDescription object itself.
     */
    public NodeTypeDescription withClientConnectionEndpointPort(int clientConnectionEndpointPort) {
        this.clientConnectionEndpointPort = clientConnectionEndpointPort;
        return this;
    }

    /**
     * Get the HTTP cluster management endpoint port.
     *
     * @return the httpGatewayEndpointPort value
     */
    public int httpGatewayEndpointPort() {
        return this.httpGatewayEndpointPort;
    }

    /**
     * Set the HTTP cluster management endpoint port.
     *
     * @param httpGatewayEndpointPort the httpGatewayEndpointPort value to set
     * @return the NodeTypeDescription object itself.
     */
    public NodeTypeDescription withHttpGatewayEndpointPort(int httpGatewayEndpointPort) {
        this.httpGatewayEndpointPort = httpGatewayEndpointPort;
        return this;
    }

    /**
     * Get the durability level of the node type. Learn about [DurabilityLevel](https://docs.microsoft.com/en-us/azure/service-fabric/service-fabric-cluster-capacity).
       - Bronze - No privileges. This is the default.
       - Silver - The infrastructure jobs can be paused for a duration of 10 minutes per UD.
       - Gold - The infrastructure jobs can be paused for a duration of 2 hours per UD. Gold durability can be enabled only on full node VM SKUs like D15_V2, G5 etc.
     . Possible values include: 'Bronze', 'Silver', 'Gold'.
     *
     * @return the durabilityLevel value
     */
    public String durabilityLevel() {
        return this.durabilityLevel;
    }

    /**
     * Set the durability level of the node type. Learn about [DurabilityLevel](https://docs.microsoft.com/en-us/azure/service-fabric/service-fabric-cluster-capacity).
       - Bronze - No privileges. This is the default.
       - Silver - The infrastructure jobs can be paused for a duration of 10 minutes per UD.
       - Gold - The infrastructure jobs can be paused for a duration of 2 hours per UD. Gold durability can be enabled only on full node VM SKUs like D15_V2, G5 etc.
     . Possible values include: 'Bronze', 'Silver', 'Gold'.
     *
     * @param durabilityLevel the durabilityLevel value to set
     * @return the NodeTypeDescription object itself.
     */
    public NodeTypeDescription withDurabilityLevel(String durabilityLevel) {
        this.durabilityLevel = durabilityLevel;
        return this;
    }

    /**
     * Get the range of ports from which cluster assigned port to Service Fabric applications.
     *
     * @return the applicationPorts value
     */
    public EndpointRangeDescription applicationPorts() {
        return this.applicationPorts;
    }

    /**
     * Set the range of ports from which cluster assigned port to Service Fabric applications.
     *
     * @param applicationPorts the applicationPorts value to set
     * @return the NodeTypeDescription object itself.
     */
    public NodeTypeDescription withApplicationPorts(EndpointRangeDescription applicationPorts) {
        this.applicationPorts = applicationPorts;
        return this;
    }

    /**
     * Get the range of ephemeral ports that nodes in this node type should be configured with.
     *
     * @return the ephemeralPorts value
     */
    public EndpointRangeDescription ephemeralPorts() {
        return this.ephemeralPorts;
    }

    /**
     * Set the range of ephemeral ports that nodes in this node type should be configured with.
     *
     * @param ephemeralPorts the ephemeralPorts value to set
     * @return the NodeTypeDescription object itself.
     */
    public NodeTypeDescription withEphemeralPorts(EndpointRangeDescription ephemeralPorts) {
        this.ephemeralPorts = ephemeralPorts;
        return this;
    }

    /**
     * Get the node type on which system services will run. Only one node type should be marked as primary. Primary node type cannot be deleted or changed for existing clusters.
     *
     * @return the isPrimary value
     */
    public boolean isPrimary() {
        return this.isPrimary;
    }

    /**
     * Set the node type on which system services will run. Only one node type should be marked as primary. Primary node type cannot be deleted or changed for existing clusters.
     *
     * @param isPrimary the isPrimary value to set
     * @return the NodeTypeDescription object itself.
     */
    public NodeTypeDescription withIsPrimary(boolean isPrimary) {
        this.isPrimary = isPrimary;
        return this;
    }

    /**
     * Get the number of nodes in the node type. This count should match the capacity property in the corresponding VirtualMachineScaleSet resource.
     *
     * @return the vmInstanceCount value
     */
    public int vmInstanceCount() {
        return this.vmInstanceCount;
    }

    /**
     * Set the number of nodes in the node type. This count should match the capacity property in the corresponding VirtualMachineScaleSet resource.
     *
     * @param vmInstanceCount the vmInstanceCount value to set
     * @return the NodeTypeDescription object itself.
     */
    public NodeTypeDescription withVmInstanceCount(int vmInstanceCount) {
        this.vmInstanceCount = vmInstanceCount;
        return this;
    }

    /**
     * Get the endpoint used by reverse proxy.
     *
     * @return the reverseProxyEndpointPort value
     */
    public Integer reverseProxyEndpointPort() {
        return this.reverseProxyEndpointPort;
    }

    /**
     * Set the endpoint used by reverse proxy.
     *
     * @param reverseProxyEndpointPort the reverseProxyEndpointPort value to set
     * @return the NodeTypeDescription object itself.
     */
    public NodeTypeDescription withReverseProxyEndpointPort(Integer reverseProxyEndpointPort) {
        this.reverseProxyEndpointPort = reverseProxyEndpointPort;
        return this;
    }

}
