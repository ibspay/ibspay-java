package com.ibs.ibspay.client.model;

/**
 * @author YQ.Huang
 */
public class ConfirmPaymentRequest {
    private String paymentId;
    private String code;

    public ConfirmPaymentRequest(String paymentId, String code) {
        this.paymentId = paymentId;
        this.code = code;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
