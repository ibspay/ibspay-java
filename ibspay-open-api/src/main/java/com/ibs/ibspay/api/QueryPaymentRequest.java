package com.ibs.ibspay.api;

/**
 * @author YQ.Huang
 */
public class QueryPaymentRequest extends BaseModel {

    /**
     * 应用支付ID，商户提供
     */
    private String appPaymentId;

    /**
     * Ibspay支付ID
     */
    private String paymentId;

    public String getAppPaymentId() {
        return appPaymentId;
    }

    public void setAppPaymentId(String appPaymentId) {
        this.appPaymentId = appPaymentId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

}
