package com.ibs.pg.java.model;


/**
 * @author YQ.Huang
 */
public class BankCard {
    private BankCode bankCode;
    private String number;              //银行卡号
    private String holderName;          //持卡人姓名
    private String holderPhone;         //持卡人电话号码
    private CitizenIdType holderIdType; //持卡人证件类型
    private String holderIdNumber;      //持卡人证件号码
    private String validDate;           //有效期(YYMM)
    private String cvv2;                //CVV2

    BankCard() {
    }

    public BankCard(BankCode bankCode, String number, String holderName, String holderPhone, CitizenIdType holderIdType, String holderIdNumber) {
        this.bankCode = bankCode;
        this.number = number;
        this.holderName = holderName;
        this.holderPhone = holderPhone;
        this.holderIdType = holderIdType;
        this.holderIdNumber = holderIdNumber;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getHolderPhone() {
        return holderPhone;
    }

    public void setHolderPhone(String holderPhone) {
        this.holderPhone = holderPhone;
    }

    public CitizenIdType getHolderIdType() {
        return holderIdType;
    }

    public void setHolderIdType(CitizenIdType holderIdType) {
        this.holderIdType = holderIdType;
    }

    public String getHolderIdNumber() {
        return holderIdNumber;
    }

    public void setHolderIdNumber(String holderIdNumber) {
        this.holderIdNumber = holderIdNumber;
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

    public BankCode getBankCode() {
        return bankCode;
    }

    public void setBankCode(BankCode bankCode) {
        this.bankCode = bankCode;
    }
}
