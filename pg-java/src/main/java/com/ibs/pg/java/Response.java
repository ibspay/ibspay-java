package com.ibs.pg.java;

public class Response {
    private String paymentId;
    private String scanCodeUrl;
    private String status;
    private String message;

    public String getScanCodeUrl() {
        return scanCodeUrl;
    }

    public void setScanCodeUrl(String scanCodeUrl) {
        this.scanCodeUrl = scanCodeUrl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
}
