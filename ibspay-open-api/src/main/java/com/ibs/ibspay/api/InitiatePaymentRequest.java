package com.ibs.ibspay.api;

import java.util.List;

/**
 * @author YQ.Huang
 */
public class InitiatePaymentRequest extends BaseModel {

    /**
     * 应用支付ID，商户提供
     */
    private String appPaymentId;

    /**
     * 订单概要
     */
    private String subject;

    /**
     * 订单金额
     */
    private Double amount;

    /**
     * 支付方式
     */
    private PaymentMethod paymentMethod;

    /**
     * 支付银行卡，使用银行卡支付时需要
     */
    private BankCard bankCard;

    /**
     * 支付成功异步通知地址
     */
    private String notifyUrl;

    /**
     * 付款人
     */
    private Payer payer;

    /**
     * 收货人
     */
    private Receiver receiver;

    /**
     * 订单列表，每个订单只能是相同的商品类型
     */
    private List<Order> orders;

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

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public BankCard getBankCard() {
        return bankCard;
    }

    public void setBankCard(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public Payer getPayer() {
        return payer;
    }

    public void setPayer(Payer payer) {
        this.payer = payer;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
