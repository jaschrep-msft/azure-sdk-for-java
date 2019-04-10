/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.storage.blob.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.v2.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for ArchiveStatus.
 */
public final class ArchiveStatus extends ExpandableStringEnum<ArchiveStatus> {
    /**
     * Static value rehydrate-pending-to-hot for ArchiveStatus.
     */
    public static final ArchiveStatus REHYDRATE_PENDING_TO_HOT = fromString("rehydrate-pending-to-hot");

    /**
     * Static value rehydrate-pending-to-cool for ArchiveStatus.
     */
    public static final ArchiveStatus REHYDRATE_PENDING_TO_COOL = fromString("rehydrate-pending-to-cool");

    /**
     * Creates or finds a ArchiveStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ArchiveStatus.
     */
    @JsonCreator
    public static ArchiveStatus fromString(String name) {
        return fromString(name, ArchiveStatus.class);
    }

    /**
     * @return known ArchiveStatus values.
     */
    public static Collection<ArchiveStatus> values() {
        return values(ArchiveStatus.class);
    }
}
