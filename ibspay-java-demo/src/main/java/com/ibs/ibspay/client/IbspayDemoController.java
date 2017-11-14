package com.ibs.ibspay.client;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pay")
public class IbspayDemoController {
    private final IbspayClient client;
    private final String paymentNotifyUrl;
    private final String refundNotifyUrl;

    public IbspayDemoController(IbspayClient client, IbspayConfiguration.Properties props) {
        this.client = client;
        this.paymentNotifyUrl = props.getPaymentNotifyUrl();
        this.refundNotifyUrl = props.getRefundNotifyUrl();
    }

//    @ResponseBody
//    @RequestMapping(value = "/placeOrder", method = POST)
//    public String placeOrder(@RequestBody String reqBody, HttpSession session) {
//        BankCard bankCard = JsonUtils.fromJson(reqBody, BankCard.class);
//        PayerInfo payerInfo=new PayerInfo();
//        payerInfo.setBankCard(bankCard);
//        long appId = 1;
//        String appPaymentId = RandomStringUtils.randomAlphanumeric(16);
//        String orderId = RandomStringUtils.randomAlphanumeric(6);
//        String subject = "test";
//        double amount = 0.01;
//        String userIp = "106.38.120.122";
//        GoodsItem orderItem = new GoodsItem("03265461", GoodsType.CLOTHING, "test", 2, "test", 0.01);
//        Order order = new Order(orderId, TransCode.TC01121990, "test", 0.01, true).addOrderItem(orderItem);
//        Risk risk = new Risk("郭策华", "15510260561", "北京市", GoodsCategory.REAL, true);
//        InitiatePaymentRequest initiatePaymentRequest = new InitiatePaymentRequest(appId, appPaymentId, subject, amount, userIp, paymentNotifyUrl, payerInfo, risk).addOrder(order).ofUMFBank();
//        Response response = client.initiate(initiatePaymentRequest);
//        session.setAttribute("paymentId", response.getPaymentId());
//
//        return response.getMessage() == null ? "please input the verify code " : response.getMessage();
//
//    }
//
//    @ResponseBody
//    @RequestMapping("/confirm")
//    public String confirmPay(@RequestBody String reqBody, HttpSession session) {
//        String paymentId = (String) session.getAttribute("paymentId");
//        ConfirmPaymentRequest verifyPaymentRequest = new ConfirmPaymentRequest(paymentId, reqBody);
//        System.out.println(verifyPaymentRequest.getPaymentId());
//        client.verify(verifyPaymentRequest);
//        return "success";
//    }
//
//    @ResponseBody
//    @RequestMapping("/scanPay")
//    public String initiateScanPay(@RequestBody String reqBody) {
//        ScanInfo scanInfo = JsonUtils.fromJson(reqBody, ScanInfo.class);
//        PayerInfo payerInfo=new PayerInfo();
//        payerInfo.setScanInfo(scanInfo);
//        long appId = 1;
//        String appPaymentId = RandomStringUtils.randomAlphanumeric(16);
//        String orderId = RandomStringUtils.randomAlphanumeric(6);
//        String subject = "test";
//        double amount = 0.01;
//        String userIp = "106.38.120.122";
//        String notifyUrl = "http://106.38.120.122";
//        GoodsItem orderItem = new GoodsItem("03265461", GoodsType.CLOTHING, "test", 2, "test", 0.01);
//        Order order = new Order(orderId, TransCode.TC01121990, "test", 0.01, true).addOrderItem(orderItem);
//        Risk risk = new Risk("郭策华", "15510260561", "北京市", GoodsCategory.REAL, true);
//        InitiatePaymentRequest initiatePaymentRequest = new InitiatePaymentRequest(appId, appPaymentId, subject, amount, userIp, notifyUrl, payerInfo, risk).addOrder(order).ofUMFAli();
//        Response response = client.initiate(initiatePaymentRequest);
//        if(null!=response.getMessage())
//            throw new BadRequest(response.getMessage());
//        return response.getScanCodeUrl();
//    }
}
