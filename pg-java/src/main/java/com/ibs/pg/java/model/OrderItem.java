package com.ibs.pg.java.model;


/**
 * @author YQ.Huang
 */
public class OrderItem {
    private String id;    //商品编号
    private ItemType type;        //商品类型
    private String name;        //商品名称
    private int quantity;    //商品数量
    private String description;    //商品描述
    private double amount;        //商品总金额对象
    private CurrencyType currency;

    public OrderItem(String id, ItemType type, String name, int quantity, String description, double amount) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.quantity = quantity;
        this.description = description;
        this.amount = amount;
        this.currency = CurrencyType.CNY;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
}
