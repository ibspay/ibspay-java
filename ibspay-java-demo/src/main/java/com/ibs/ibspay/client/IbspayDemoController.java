package com.ibs.ibspay.client;

import com.ibs.ibspay.common.model.*;
import com.ibs.ibspay.common.util.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("/pay")
public class IbspayDemoController {
    private final IbspayClient client;
    private final String paymentNotifyUrl;
    private final String refundNotifyUrl;

    public IbspayDemoController(IbspayClient client, IbspayProperties props) {
        this.client = client;
        this.paymentNotifyUrl = props.getPaymentNotifyUrl();
        this.refundNotifyUrl = props.getRefundNotifyUrl();
    }

    @ResponseBody
    @RequestMapping(value = "/placeOrder", method = POST)
    public String placeOrder(@RequestBody String reqBody, HttpSession session) {
        InitiatePaymentRequest initiatePaymentRequest = JsonUtils.fromJson(reqBody, InitiatePaymentRequest.class);
        initiatePaymentRequest.setNotifyUrl(paymentNotifyUrl);
        Receiver receiver = new Receiver();
        receiver.setAddress("北京市");
        receiver.setName("郭策华");
        receiver.setMobile("15510260561");
        initiatePaymentRequest.setReceiver(receiver);
        InitiatePaymentResponse response = client.initiate(initiatePaymentRequest);
        session.setAttribute("paymentId", response.getPaymentId());
        return "success";
    }

    @ResponseBody
    @RequestMapping("/confirm")
    public String confirmPay(@RequestBody String code, HttpSession session) {
        String paymentId = (String) session.getAttribute("paymentId");
        ConfirmPaymentRequest request = new ConfirmPaymentRequest();
        request.setPaymentId(paymentId);
        request.setCode(code);
        ConfirmPaymentResponse response = client.confirm(request);
        return "success";
    }

    @ResponseBody
    @RequestMapping("/scanPay")
    public String initiateScanPay(@RequestBody String reqBody) {
        InitiatePaymentRequest initiatePaymentRequest = JsonUtils.fromJson(reqBody, InitiatePaymentRequest.class);
        initiatePaymentRequest.setNotifyUrl(paymentNotifyUrl);
        Receiver receiver = new Receiver();
        receiver.setAddress("北京市");
        receiver.setName("郭策华");
        receiver.setMobile("13691229097");
        initiatePaymentRequest.setReceiver(receiver);
        InitiatePaymentResponse response = client.initiate(initiatePaymentRequest);
        return response.getCodeUrl();
    }
}
