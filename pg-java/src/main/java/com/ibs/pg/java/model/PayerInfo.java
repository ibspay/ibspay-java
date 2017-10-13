package com.ibs.pg.java.model;

public class PayerInfo {
    private BankCard bankCard;

    private ScanInfo scanInfo;

    public BankCard getBankCard() {
        return bankCard;
    }

    public void setBankCard(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public ScanInfo getScanInfo() {
        return scanInfo;
    }

    public void setScanInfo(ScanInfo scanInfo) {
        this.scanInfo = scanInfo;
    }
}
