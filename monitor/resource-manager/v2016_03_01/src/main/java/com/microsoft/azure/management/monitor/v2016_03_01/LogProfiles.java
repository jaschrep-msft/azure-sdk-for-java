/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2016_03_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.monitor.v2016_03_01.implementation.LogProfilesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing LogProfiles.
 */
public interface LogProfiles extends SupportsCreating<LogProfileResource.DefinitionStages.Blank>, SupportsListing<LogProfileResource>, HasInner<LogProfilesInner> {
    /**
     * Deletes the log profile.
     *
     * @param logProfileName The name of the log profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String logProfileName);

    /**
     * Gets the log profile.
     *
     * @param logProfileName The name of the log profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<LogProfileResource> getAsync(String logProfileName);

}
