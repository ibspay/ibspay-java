package com.ibs.pg.java.demo;


import com.ibs.pg.java.InitiatePaymentRequest;
import com.ibs.pg.java.PgClient;
import com.ibs.pg.java.Response;
import com.ibs.pg.java.VerifyPaymentRequest;
import com.ibs.pg.java.model.*;
import com.ibs.pg.java.utils.JsonUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("/pay")
public class DemoController {
    private final PgClient client;
    private final String paymentNotifyUrl;
    private final String refundNotifyUrl;

    public DemoController(PgClient client, PgJavaDemo.Config.Properties props) {
        this.client = client;
        this.paymentNotifyUrl = props.getPaymentNotifyUrl();
        this.refundNotifyUrl = props.getRefundNotifyUrl();
    }

    @ResponseBody
    @RequestMapping(value = "/placeOrder", method = POST)
    public String placeOrder(@RequestBody String reqBody, HttpSession session) {
        BankCard bankCard = JsonUtils.fromJson(reqBody, BankCard.class);
        long appId = 1;
        String appPaymentId = RandomStringUtils.randomAlphanumeric(16);
        String orderId = RandomStringUtils.randomAlphanumeric(6);
        String subject = "test";
        double amount = 0.01;
        String userIp = "106.38.120.122";
        OrderItem orderItem = new OrderItem("03265461", OrderItemType.CLOTHING, "test", 2, "test", 0.01);
        Order order = new Order(orderId, TransCode.TC01121990, "test", 0.01, true).addOrderItem(orderItem);
        Risk risk = new Risk("郭策华", "15510260561", "北京市", GoodsType.REAL, true);
        InitiatePaymentRequest initiatePaymentRequest = new InitiatePaymentRequest(appId, appPaymentId, subject, amount, userIp, paymentNotifyUrl, bankCard, risk).addOrder(order).ofUMFBank();
        Response response = client.initiate(initiatePaymentRequest);
        session.setAttribute("paymentId", response.getPaymentId());

        return response.getMessage() == null ? "please input the verify code " : response.getMessage();

    }

    @ResponseBody
    @RequestMapping("/confirm")
    public String confirmPay(@RequestBody String reqBody, HttpSession session) {
        String paymentId = (String) session.getAttribute("paymentId");
        VerifyPaymentRequest verifyPaymentRequest = new VerifyPaymentRequest(paymentId, reqBody);
        System.out.println(verifyPaymentRequest.getPaymentId());
        client.verify(verifyPaymentRequest);
        return "success";
    }
}
