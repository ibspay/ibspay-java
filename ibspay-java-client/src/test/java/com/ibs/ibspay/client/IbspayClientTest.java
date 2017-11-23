package com.ibs.ibspay.client;

import com.ibs.ibspay.api.*;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Collections;

@Ignore
public class IbspayClientTest {

    IbspayClient client = new IbspayClient("http://localhost:40000", "test", "test");

    @Test
    public void initiateBankCard() throws Exception {
        BankCard bankCard = new BankCard();
        bankCard.setNumber("6222020200021110172");

        InitiatePaymentRequest request = getInitiatePaymentRequest();
        request.setBankCard(bankCard);
        request.setPaymentMethod(PaymentMethod.BAND_CARD);

        InitiatePaymentResponse response = client.initiate(request);
        System.out.println("response = " + response);
    }

    @Test
    public void initiateWxCode() throws Exception {
        InitiatePaymentRequest request = getInitiatePaymentRequest();
        request.setPaymentMethod(PaymentMethod.WECHAT_SCAN);

        InitiatePaymentResponse response = client.initiate(request);
        System.out.println("response = " + response);
    }

    @Test
    public void initiateAliCode() throws Exception {
        InitiatePaymentRequest request = getInitiatePaymentRequest();
        request.setPaymentMethod(PaymentMethod.ALIPAY_SCAN);

        InitiatePaymentResponse response = client.initiate(request);
        System.out.println("response = " + response);
    }

    @Test
    public void confirm() throws Exception {
        ConfirmPaymentRequest request = new ConfirmPaymentRequest();
        request.setPaymentId("3cbf5ee81cbe40788ff86f47f439c603");
        request.setCode("791124");

        ConfirmPaymentResponse response = client.confirm(request);
        System.out.println("response = " + response);
    }

    @Test
    public void refund() throws Exception {
        InitiateRefundRequest request = new InitiateRefundRequest();
        request.setAppRefundId("TEST" + System.currentTimeMillis());
        request.setPaymentId("5daf75e674214d3ea0bf3bd45475be14");
        request.setSubject("TEST");
        request.setNotifyUrl("http://106.38.120.122");

        InitiateRefundResponse response = client.refund(request);
        System.out.println("response = " + response);
    }

    @Test
    public void queryPayment() throws Exception {
        QueryPaymentRequest request = new QueryPaymentRequest();
        request.setPaymentId("3cbf5ee81cbe40788ff86f47f439c603");
        QueryPaymentResponse response = client.queryPayment(request);
        System.out.println("response = " + response);
    }

    @Test
    public void queryRefund() throws Exception {
        QueryRefundRequest request = new QueryRefundRequest();
        request.setRefundId("d0c0199e7543476cb228c1e74920e7a0");
        QueryRefundResponse response = client.queryRefund(request);
        System.out.println("response = " + response);
    }

    private InitiatePaymentRequest getInitiatePaymentRequest() {
        Payer payer = new Payer();
        payer.setCitizenId("360502197905221670");
        payer.setIp("106.38.120.122");
        payer.setMobile("13691229097");
        payer.setName("黄玉强");

        GoodsItem item = new GoodsItem();
        item.setGoodsNo("TEST");
        item.setPrice(0.01);
        item.setQuantity(1);
        item.setGoodsType(GoodsType.CLOTHING);
        item.setGoodsName("TEST");
        item.setDescription("TEST");

        Order order = new Order();
        order.setAmount(0.01);
        order.setCustoms(false);
        order.setInvoiceNo("TEST");
        order.setOrderNo("TEST" + System.currentTimeMillis());
        order.setTransCode(TransCode.TC01122030);
        order.setItems(Collections.singletonList(item));

        Receiver receiver = new Receiver();
        receiver.setAddress("北京市");
        receiver.setName("黄玉强");
        receiver.setMobile("13691229097");

        InitiatePaymentRequest request = new InitiatePaymentRequest();
        request.setSubject("TEST");
        request.setAmount(0.01);
        request.setAppPaymentId("TEST" + System.currentTimeMillis());
        request.setNotifyUrl("http://106.38.120.122");
        request.setOrders(Collections.singletonList(order));
        request.setPayer(payer);
        request.setReceiver(receiver);
        return request;
    }

}