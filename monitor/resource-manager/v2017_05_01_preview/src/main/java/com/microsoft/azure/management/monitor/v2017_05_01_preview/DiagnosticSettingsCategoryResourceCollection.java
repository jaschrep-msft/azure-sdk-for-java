/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2017_05_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.monitor.v2017_05_01_preview.implementation.InsightsManager;
import com.microsoft.azure.management.monitor.v2017_05_01_preview.implementation.DiagnosticSettingsCategoryResourceCollectionInner;
import com.microsoft.azure.management.monitor.v2017_05_01_preview.implementation.DiagnosticSettingsCategoryResourceInner;
import java.util.List;

/**
 * Type representing DiagnosticSettingsCategoryResourceCollection.
 */
public interface DiagnosticSettingsCategoryResourceCollection extends HasInner<DiagnosticSettingsCategoryResourceCollectionInner>, HasManager<InsightsManager> {
    /**
     * @return the value value.
     */
    List<DiagnosticSettingsCategoryResourceInner> value();

}
