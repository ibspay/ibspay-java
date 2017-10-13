package com.ibs.pg.java;


import com.ibs.pg.java.model.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YQ.Huang
 */
public class InitiatePaymentRequest {

    private long appId;

    private String appPaymentId;

    private String subject;

    private double amount;

    private CurrencyType currency;

    private ChannelType channel;

    private String userIp;

    private String notifyUrl;

    private PayerInfo payerInfo;

    private List<Order> orders;

    private Risk risk;

    public InitiatePaymentRequest(long appId, String appPaymentId, String subject, double amount, String userIp, String notifyUrl, PayerInfo payerInfo, Risk risk) {
        this.appId = appId;
        this.appPaymentId = appPaymentId;
        this.subject = subject;
        this.amount = amount;
        this.userIp = userIp;
        this.notifyUrl = notifyUrl;
        this.payerInfo = payerInfo;
        this.risk = risk;
        this.currency = CurrencyType.CNY;
        this.orders = new ArrayList<Order>();
    }

    public InitiatePaymentRequest addOrder(Order order) {
        orders.add(order);
        return this;
    }

    public InitiatePaymentRequest ofUMFBank() {
        channel = ChannelType.UMF_BANK_CARD;
        return this;
    }
    public InitiatePaymentRequest ofUMFAli(){
        channel=ChannelType.UMF_ALIPAY_CODE;
        return this;
    }
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public ChannelType getChannel() {
        return channel;
    }

    public void setChannel(ChannelType channel) {
        this.channel = channel;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    public CurrencyType getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyType currency) {
        this.currency = currency;
    }

    public Risk getRisk() {
        return risk;
    }

    public void setRisk(Risk risk) {
        this.risk = risk;
    }

    public PayerInfo getPayerInfo() {
        return payerInfo;
    }

    public void setPayerInfo(PayerInfo payerInfo) {
        this.payerInfo = payerInfo;
    }
}
