package com.ibs.ibspay.api;

/**
 * @author YQ.Huang
 */
public class InitiatePaymentResponse extends BaseModel {
    private String paymentId;
    private String codeUrl;

    public String getCodeUrl() {
        return codeUrl;
    }

    public void setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
}
