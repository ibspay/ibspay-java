package com.ibs.ibspay.client;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

/**
 * @author York Huang
 * @date 2017/11/14
 */
@Validated
@ConfigurationProperties(prefix = "ibspay")
public class IbspayProperties {

    /**
     * Base Url for Ibspay
     */
    @NotBlank
    private String url;

    /**
     * Access Key for Ibspay
     */
    @NotBlank
    private String accessKey;

    /**
     * Access Secret for Ibspay
     */
    @NotBlank
    private String accessSecret;

    /**
     * Url for Payment Notification
     */
    @NotBlank
    private String paymentNotifyUrl;

    /**
     * Url for Refund Notification
     */
    @NotBlank
    private String refundNotifyUrl;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getAccessSecret() {
        return accessSecret;
    }

    public void setAccessSecret(String accessSecret) {
        this.accessSecret = accessSecret;
    }

    public String getPaymentNotifyUrl() {
        return paymentNotifyUrl;
    }

    public void setPaymentNotifyUrl(String paymentNotifyUrl) {
        this.paymentNotifyUrl = paymentNotifyUrl;
    }

    public String getRefundNotifyUrl() {
        return refundNotifyUrl;
    }

    public void setRefundNotifyUrl(String refundNotifyUrl) {
        this.refundNotifyUrl = refundNotifyUrl;
    }
}
