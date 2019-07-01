/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2018_04_16;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import com.microsoft.azure.management.monitor.v2018_04_16.implementation.ScheduledQueryRulesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ScheduledQueryRules.
 */
public interface ScheduledQueryRules extends SupportsCreating<LogSearchRuleResource.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<LogSearchRuleResource>, SupportsListingByResourceGroup<LogSearchRuleResource>, SupportsListing<LogSearchRuleResource>, HasInner<ScheduledQueryRulesInner> {
}
