package com.ibs.ibspay.api;

/**
 * @author YQ.Huang
 */
public class QueryRefundResponse extends BaseModel {
    private String refundId;
    private TransStatus status;

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public TransStatus getStatus() {
        return status;
    }

    public void setStatus(TransStatus status) {
        this.status = status;
    }
}
