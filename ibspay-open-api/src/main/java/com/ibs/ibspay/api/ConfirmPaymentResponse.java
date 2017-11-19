package com.ibs.ibspay.api;

/**
 * @author YQ.Huang
 */
public class ConfirmPaymentResponse extends BaseModel {
    private String paymentId;

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
}
