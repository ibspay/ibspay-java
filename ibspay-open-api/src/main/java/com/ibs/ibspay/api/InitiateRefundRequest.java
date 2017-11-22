package com.ibs.ibspay.api;

/**
 * @author YQ.Huang
 */
public class InitiateRefundRequest extends BaseModel {

    /**
     * 应用支付ID，商户提供
     */
    private String appPaymentId;

    /**
     * 应用退款ID，商户提供
     */
    private String appRefundId;

    /**
     * Ibspay支付ID
     */
    private String paymentId;

    /**
     * 订单概要
     */
    private String subject;

    /**
     * 退款成功异步通知地址
     */
    private String notifyUrl;

    public String getAppPaymentId() {
        return appPaymentId;
    }

    public void setAppPaymentId(String appPaymentId) {
        this.appPaymentId = appPaymentId;
    }

    public String getAppRefundId() {
        return appRefundId;
    }

    public void setAppRefundId(String appRefundId) {
        this.appRefundId = appRefundId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }
}
