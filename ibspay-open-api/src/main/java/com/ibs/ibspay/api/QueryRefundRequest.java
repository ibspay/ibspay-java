package com.ibs.ibspay.api;

/**
 * @author YQ.Huang
 */
public class QueryRefundRequest extends BaseModel {
    /**
     * 应用ID，商户在Ibspay内创建应用获得
     */
    private Long appId;

    /**
     * 应用支付ID，商户提供
     */
    private String appRefundId;

    /**
     * Ibspay支付ID
     */
    private String refundId;

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public String getAppRefundId() {
        return appRefundId;
    }

    public void setAppRefundId(String appRefundId) {
        this.appRefundId = appRefundId;
    }

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }
}
