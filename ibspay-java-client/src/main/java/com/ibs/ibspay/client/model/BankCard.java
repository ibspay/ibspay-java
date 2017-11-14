package com.ibs.ibspay.client.model;

/**
 * @author York Huang
 */
public class BankCard extends BaseModel {
    /**
     * 银行卡号
     */
    private String number;

    /**
     * 信用卡有效期(YYMM)
     */
    private String validDate;

    /**
     * 信用卡CVV2
     */
    private String cvv2;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getValidDate() {
        return validDate;
    }

    public void setValidDate(String validDate) {
        this.validDate = validDate;
    }

    public String getCvv2() {
        return cvv2;
    }

    public void setCvv2(String cvv2) {
        this.cvv2 = cvv2;
    }
}
