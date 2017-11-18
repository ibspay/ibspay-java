package com.ibs.ibspay.client;

import com.ibs.ibspay.api.*;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.assertNotNull;

@Ignore
public class IbspayClientTest {

    IbspayClient client = new IbspayClient("http://localhost:8081", "KEY", "SECRET");

    @Test
    public void initiate() throws Exception {

        BankCard bankCard = new BankCard();
        bankCard.setNumber("6214830109741529");

        Payer payer = new Payer();
        payer.setCitizenId("130682199304280011");
        payer.setIp("106.38.120.122");
        payer.setMobile("15510260561");
        payer.setName("郭策华");

        GoodsItem item = new GoodsItem();
        item.setGoodsNo("03265461");
        item.setPrice(0.01);
        item.setQuantity(1);
        item.setGoodsType(GoodsType.CLOTHING);
        item.setGoodsName("test");
        item.setDescription("test");

        Order order = new Order();
        order.setAmount(0.01);
        order.setCustoms(false);
        order.setInvoiceNo("1");
        order.setOrderNo(System.currentTimeMillis() + "");
        order.setTransCode(TransCode.TC01122030);
        order.setItems(Collections.singletonList(item));

        Receiver receiver = new Receiver();
        receiver.setAddress("北京市");
        receiver.setName("郭策华");
        receiver.setMobile("15510260561");

        InitiatePaymentRequest request = new InitiatePaymentRequest();
        request.setSubject("test");
        request.setAmount(0.01);
        request.setAppId(1L);
        request.setAppPaymentId(System.currentTimeMillis() + "");
        request.setNotifyUrl("http://106.38.120.122");
        request.setOrders(Collections.singletonList(order));
        request.setPayer(payer);
        request.setReceiver(receiver);

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