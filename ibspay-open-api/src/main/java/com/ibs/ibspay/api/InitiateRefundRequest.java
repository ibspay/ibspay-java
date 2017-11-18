package com.ibs.ibspay.api;

/**
 * @author YQ.Huang
 */
public class InitiateRefundRequest extends BaseModel {

    private long appId;

    private String appPaymentId;

    private String appRefundId;

    private String subject;

    private String notifyUrl;

    public long getAppId() {
        return appId;
    }

    public void setAppId(long appId) {
        this.appId = appId;
    }

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
