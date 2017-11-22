package com.ibs.ibspay.api;

/**
 * @author YQ.Huang
 */
public class QueryRefundRequest extends BaseModel {

    /**
     * 应用支付ID，商户提供
     */
    private String appRefundId;

    /**
     * Ibspay支付ID
     */
    private String refundId;

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
