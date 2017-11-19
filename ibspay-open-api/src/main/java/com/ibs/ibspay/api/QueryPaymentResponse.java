package com.ibs.ibspay.api;

/**
 * @author YQ.Huang
 */
public class QueryPaymentResponse extends BaseModel {
    private String paymentId;
    private TransStatus status;

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public TransStatus getStatus() {
        return status;
    }

    public void setStatus(TransStatus status) {
        this.status = status;
    }
}
