/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview.implementation.ProjectTaskInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview.implementation.DataMigrationManager;

/**
 * Type representing ServiceProjectTask.
 */
public interface ServiceProjectTask extends HasInner<ProjectTaskInner>, HasManager<DataMigrationManager> {
    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    ProjectTaskProperties properties();

    /**
     * @return the type value.
     */
    String type();

}
