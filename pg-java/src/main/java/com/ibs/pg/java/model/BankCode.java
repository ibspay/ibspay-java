package com.ibs.pg.java.model;

public enum BankCode {

    ABC("中国农业银行", true, true),
    BEA("东亚银行", true, true),
    BOC("中国银行", true, true),
    BSB("包商银行", true, false),
    CCB("中国建设银行", true, true),
    CDRCB("成都农村商业银行", true, false),
    CEB("光大银行", true, true),
    CIB("兴业银行", true, true),
    CITIC("中信银行", true, true),
    CMB("中国招商银行", false, true),
    CMBC("中国民生银行", true, true),
    COMM("交通银行", false, true),
    CQB("重庆银行", true, false),
    CRCB("重庆农村商业银行", true, false),
    CSCB("长沙银行", true, false),
    DAQINGB("龙江银行", true, false),
    DLB("大连银行", true, false),
    GCB("广州银行", true, false),
    GDB("广东发展银行", false, true),
    GRCB("广州农村商业银行", true, false),
    HEBB("哈尔滨银行", true, false),
    HSB("徽商银行", true, false),
    HXB("华夏银行", true, false),
    HZCB("杭州银行", true, false),
    ICBC("中国工商银行", true, true),
    JSB("江苏银行", true, false),
    NBB("宁波银行", true, false),
    NCB("南昌银行", true, false),
    NJCB("南京银行", true, false),
    PSBC("中国邮政储蓄银行", true, false),
    SDEB("顺德农村商业银行", true, false),
    SPAB("平安银行", true, true),
    SPDB("上海浦东发展银行", true, true),
    TZCB("台州银行", true, false),
    WRCB("无锡农村商业银行", true, false),
    WZCB("温州银行", true, false),
    ZJTLCB("浙江泰隆商业银行", true, false);

    private final String name;
    private final boolean supportCreditPay;
    private final boolean supportDebitPay;

    BankCode(String name, boolean supportCreditPay, boolean supportDebitPay) {
        this.name = name;
        this.supportCreditPay = supportCreditPay;
        this.supportDebitPay = supportDebitPay;
    }
}
