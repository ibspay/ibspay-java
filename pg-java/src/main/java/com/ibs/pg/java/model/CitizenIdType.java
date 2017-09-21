package com.ibs.pg.java.model;

public enum CitizenIdType {
    IDENTITY_CARD("1");

    private final String code;

    CitizenIdType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
