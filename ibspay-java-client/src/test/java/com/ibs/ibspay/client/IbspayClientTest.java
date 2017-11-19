package com.ibs.ibspay.client;

import com.ibs.ibspay.api.*;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.assertNotNull;

@Ignore
public class IbspayClientTest {

    IbspayClient client = new IbspayClient("http://localhost:40000", "TEST", "TEST");

    @Test
    public void initiate() throws Exception {

        BankCard bankCard = new BankCard();
        bankCard.setNumber("6222020200021110172");

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
        request.setAppId(1L);
        request.setAppPaymentId("TEST" + System.currentTimeMillis());
        request.setNotifyUrl("http://106.38.120.122");
        request.setOrders(Collections.singletonList(order));
        request.setPayer(payer);
        request.setReceiver(receiver);
        request.setBankCard(bankCard);

        InitiatePaymentResponse response = client.initiate(request);
        assertNotNull(response);

    }

    @Test
    public void confirm() throws Exception {
        String paymentId = "a8c5d474a1fc47e88b99cb21203c639d";
        String verifyCode = "011927";
        ConfirmPaymentRequest request = new ConfirmPaymentRequest(paymentId, verifyCode);
//        String response = client.confirm(request);

    }

}