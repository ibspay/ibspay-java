package com.ibs.ibspay.client.model;

/**
 * @author York Huang
 */
public enum PaymentMethod {
    BAND_CARD,      // 银行卡
    ALIPAY_SCAN,    // 支付宝扫码
    ALIPAY_JSAPI,   // 支付宝公众号
    ALIPAY_APP,     // 支付宝APP
    WECHAT_SCAN,    // 微信扫码
    WECHAT_JSAPI,   // 微信公众号
    WECHAT_APP,     // 微信APP
}
