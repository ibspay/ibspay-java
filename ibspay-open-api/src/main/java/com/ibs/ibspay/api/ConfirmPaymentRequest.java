package com.ibs.ibspay.api;

/**
 * @author YQ.Huang
 */
public class ConfirmPaymentRequest extends BaseModel {
    /**
     * 应用ID，商户在Ibspay内创建应用获得
     */
    private Long appId;

    /**
     * 应用支付ID，商户提供
     */
    private String appPaymentId;

    /**
     * Ibspay支付ID
     */
    private String paymentId;

    /**
     * 短信验证码
     */
    private String code;

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
