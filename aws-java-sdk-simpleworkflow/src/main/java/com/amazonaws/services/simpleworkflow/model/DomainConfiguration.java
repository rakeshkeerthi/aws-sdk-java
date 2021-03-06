/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the configuration settings of a domain.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * The retention period for workflow executions in this domain.
     * </p>
     */
    private String workflowExecutionRetentionPeriodInDays;

    /**
     * <p>
     * The retention period for workflow executions in this domain.
     * </p>
     * 
     * @param workflowExecutionRetentionPeriodInDays
     *        The retention period for workflow executions in this domain.
     */

    public void setWorkflowExecutionRetentionPeriodInDays(String workflowExecutionRetentionPeriodInDays) {
        this.workflowExecutionRetentionPeriodInDays = workflowExecutionRetentionPeriodInDays;
    }

    /**
     * <p>
     * The retention period for workflow executions in this domain.
     * </p>
     * 
     * @return The retention period for workflow executions in this domain.
     */

    public String getWorkflowExecutionRetentionPeriodInDays() {
        return this.workflowExecutionRetentionPeriodInDays;
    }

    /**
     * <p>
     * The retention period for workflow executions in this domain.
     * </p>
     * 
     * @param workflowExecutionRetentionPeriodInDays
     *        The retention period for workflow executions in this domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainConfiguration withWorkflowExecutionRetentionPeriodInDays(String workflowExecutionRetentionPeriodInDays) {
        setWorkflowExecutionRetentionPeriodInDays(workflowExecutionRetentionPeriodInDays);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getWorkflowExecutionRetentionPeriodInDays() != null)
            sb.append("WorkflowExecutionRetentionPeriodInDays: ").append(getWorkflowExecutionRetentionPeriodInDays());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainConfiguration == false)
            return false;
        DomainConfiguration other = (DomainConfiguration) obj;
        if (other.getWorkflowExecutionRetentionPeriodInDays() == null ^ this.getWorkflowExecutionRetentionPeriodInDays() == null)
            return false;
        if (other.getWorkflowExecutionRetentionPeriodInDays() != null
                && other.getWorkflowExecutionRetentionPeriodInDays().equals(this.getWorkflowExecutionRetentionPeriodInDays()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkflowExecutionRetentionPeriodInDays() == null) ? 0 : getWorkflowExecutionRetentionPeriodInDays().hashCode());
        return hashCode;
    }

    @Override
    public DomainConfiguration clone() {
        try {
            return (DomainConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
