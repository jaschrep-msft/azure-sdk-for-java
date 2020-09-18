// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for FieldValueSelectionMark. */
public final class FieldValueSelectionMark extends ExpandableStringEnum<FieldValueSelectionMark> {
    /** Static value selected for FieldValueSelectionMark. */
    public static final FieldValueSelectionMark SELECTED = fromString("selected");

    /** Static value unselected for FieldValueSelectionMark. */
    public static final FieldValueSelectionMark UNSELECTED = fromString("unselected");

    /**
     * Creates or finds a FieldValueSelectionMark from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FieldValueSelectionMark.
     */
    @JsonCreator
    public static FieldValueSelectionMark fromString(String name) {
        return fromString(name, FieldValueSelectionMark.class);
    }

    /** @return known FieldValueSelectionMark values. */
    public static Collection<FieldValueSelectionMark> values() {
        return values(FieldValueSelectionMark.class);
    }
}