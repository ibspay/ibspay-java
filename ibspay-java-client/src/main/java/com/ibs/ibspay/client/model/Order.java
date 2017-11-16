package com.ibs.ibspay.client.model;


import java.util.List;

/**
 * @author York Huang
 */
public class Order extends BaseModel {

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 交易代码
     */
    private TransCode transCode;

    /**
     * 金额
     */
    private Double amount;

    /**
     * 是否报关
     */
    private Boolean customs;

    /**
     * 发票号
     */
    private String invoiceNo;

    /**
     * 商品列表
     */
    private List<GoodsItem> items;

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

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Boolean isCustoms() {
        return customs;
    }

    public void setCustoms(Boolean customs) {
        this.customs = customs;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public List<GoodsItem> getItems() {
        return items;
    }

    public void setItems(List<GoodsItem> items) {
        this.items = items;
    }
}

