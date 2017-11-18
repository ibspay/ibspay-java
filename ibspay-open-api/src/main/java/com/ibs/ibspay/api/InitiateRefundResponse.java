package com.ibs.ibspay.api;

/**
 * @author YQ.Huang
 */
public class InitiateRefundResponse extends BaseModel {
    private String refundId;

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }
}
