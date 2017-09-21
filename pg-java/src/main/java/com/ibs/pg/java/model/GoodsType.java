package com.ibs.pg.java.model;

public enum GoodsType {
    VIRTUAL("0"),
    REALGOODS("1"),
    TICKET("2"),
    ELECTRONICS("3");

    private String number;

    GoodsType(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }
}
