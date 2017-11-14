package com.ibs.ibspay.client.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author YQ.Huang
 */
public abstract class BaseModel {
    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .toString();
    }
}
