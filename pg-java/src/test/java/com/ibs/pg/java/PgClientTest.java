package com.ibs.pg.java;

import com.ibs.pg.java.model.*;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

@Ignore
public class PgClientTest {
    @Test
    public void initiate() throws Exception {
        long appId = 1;
        String appPaymentId = System.currentTimeMillis() + "";
        String subject = "test";
        double amount = 0.01;
        String userIp = "106.38.120.122";
        String notifyUrl = "http://106.38.120.122";
        BankCard bankCard = new BankCard(BankCode.CMB, "6214830109741529", "郭策华",
                "15510260561", CitizenIdType.IDENTITY_CARD, "130682199304280011");
        OrderItem orderItem = new OrderItem("03265461", ItemType.CLOTHING, "test", 2, "test", 0.01);
        Order order = new Order("2156458", TransCode.TC_01121990, "test", 0.01, true).addOrderItem(orderItem);
        Risk risk = new Risk("郭策华", "15510260561", "北京市", GoodsType.REALGOODS, true);
        InitiatePaymentRequest initiatePaymentRequest = new InitiatePaymentRequest(appId, appPaymentId, subject, amount, userIp, notifyUrl, bankCard, risk).addOrder(order).ofUMFBank();
        PgClient pgClient = new PgClient();
        Response response = pgClient.initiate(initiatePaymentRequest);
        assertNotNull(response);

    }

    @Test
    public void verify() throws Exception {
        String paymentId = "a8c5d474a1fc47e88b99cb21203c639d";
        String verifyCode = "011927";
        VerifyPaymentRequest verifyPaymentRequest = new VerifyPaymentRequest(paymentId, verifyCode);
        PgClient pgClient = new PgClient();
        String response = pgClient.verify(verifyPaymentRequest);

    }

}