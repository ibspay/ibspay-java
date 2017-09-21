package com.ibs.pg.java.model;


import java.util.ArrayList;
import java.util.List;

/**
 * @author YQ.Huang
 */
public class Order {

    private String orderNo;    //商户子订单号

    private TransCode transCode;        //子订单业务编码

    private String transType;        //子订单业务类型

    private double amount;            //子订单金额

    private CurrencyType currency;

    private boolean customs;            //是否报关

    private String invoiceId;            //子单发票号

    private List<OrderItem> items;            //交易明细，具体见item对象的说明

    public Order(String orderNo, TransCode transCode, String transType, double amount, boolean customs) {
        this.orderNo = orderNo;
        this.transCode = transCode;
        this.transType = transType;
        this.amount = amount;
        this.customs = customs;
        this.currency = CurrencyType.CNY;
        this.items = new ArrayList<OrderItem>();
    }

    public Order addOrderItem(OrderItem orderItem) {
        items.add(orderItem);
        return this;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public TransCode getTransCode() {
        return transCode;
    }

    public void setTransCode(TransCode transCode) {
        this.transCode = transCode;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public CurrencyType getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyType currency) {
        this.currency = currency;
    }

    public boolean isCustoms() {
        return customs;
    }

    public void setCustoms(boolean customs) {
        this.customs = customs;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }
}

