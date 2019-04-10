/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.edgegateway.v2019_03_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for DayOfWeek.
 */
public final class DayOfWeek extends ExpandableStringEnum<DayOfWeek> {
    /** Static value Sunday for DayOfWeek. */
    public static final DayOfWeek SUNDAY = fromString("Sunday");

    /** Static value Monday for DayOfWeek. */
    public static final DayOfWeek MONDAY = fromString("Monday");

    /** Static value Tuesday for DayOfWeek. */
    public static final DayOfWeek TUESDAY = fromString("Tuesday");

    /** Static value Wednesday for DayOfWeek. */
    public static final DayOfWeek WEDNESDAY = fromString("Wednesday");

    /** Static value Thursday for DayOfWeek. */
    public static final DayOfWeek THURSDAY = fromString("Thursday");

    /** Static value Friday for DayOfWeek. */
    public static final DayOfWeek FRIDAY = fromString("Friday");

    /** Static value Saturday for DayOfWeek. */
    public static final DayOfWeek SATURDAY = fromString("Saturday");

    /**
     * Creates or finds a DayOfWeek from its string representation.
     * @param name a name to look for
     * @return the corresponding DayOfWeek
     */
    @JsonCreator
    public static DayOfWeek fromString(String name) {
        return fromString(name, DayOfWeek.class);
    }

    /**
     * @return known DayOfWeek values
     */
    public static Collection<DayOfWeek> values() {
        return values(DayOfWeek.class);
    }
}
