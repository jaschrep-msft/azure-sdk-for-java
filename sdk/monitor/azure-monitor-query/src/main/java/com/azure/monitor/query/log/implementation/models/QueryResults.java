// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.log.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Contains the tables, columns &amp; rows resulting from a query. */
@Fluent
public final class QueryResults {
    /*
     * The list of tables, columns and rows.
     */
    @JsonProperty(value = "tables")
    private List<Table> tables;

    /*
     * Statistics represented in JSON format.
     */
    @JsonProperty(value = "statistics")
    private Object statistics;

    /*
     * The code and message for an error.
     */
    @JsonProperty(value = "error")
    private ErrorInfo error;

    /**
     * Creates an instance of QueryResults class.
     *
     * @param tables the tables value to set.
     */
    @JsonCreator
    public QueryResults(@JsonProperty(value = "tables") List<Table> tables) {
        this.tables = tables;
    }

    /**
     * Get the tables property: The list of tables, columns and rows.
     *
     * @return the tables value.
     */
    public List<Table> getTables() {
        return this.tables;
    }

    /**
     * Get the statistics property: Statistics represented in JSON format.
     *
     * @return the statistics value.
     */
    public Object getStatistics() {
        return this.statistics;
    }

    /**
     * Set the statistics property: Statistics represented in JSON format.
     *
     * @param statistics the statistics value to set.
     * @return the QueryResults object itself.
     */
    public QueryResults setStatistics(Object statistics) {
        this.statistics = statistics;
        return this;
    }

    /**
     * Get the error property: The code and message for an error.
     *
     * @return the error value.
     */
    public ErrorInfo getError() {
        return this.error;
    }

    /**
     * Set the error property: The code and message for an error.
     *
     * @param error the error value to set.
     * @return the QueryResults object itself.
     */
    public QueryResults setError(ErrorInfo error) {
        this.error = error;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getTables() == null) {
            throw new IllegalArgumentException("Missing required property tables in model QueryResults");
        } else {
            getTables().forEach(e -> e.validate());
        }
        if (getError() != null) {
            getError().validate();
        }
    }
}
