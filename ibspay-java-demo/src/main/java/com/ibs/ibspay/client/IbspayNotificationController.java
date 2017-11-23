package com.ibs.ibspay.client;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YQ.Huang
 */
@RestController
@RequestMapping("/notification")
public class IbspayNotificationController {

    @PostMapping("/payment")
    public String onPaymentSucceed(@RequestBody String body) {
        System.out.println("Received Payment Notification: body = [" + body + "]");
        return "ok";
    }

    @PostMapping("/refund")
    public String onRefundSucceed(@RequestBody String body) {
        System.out.println("Received Refund Notification: body = [" + body + "]");
        return "ok";
    }
}
