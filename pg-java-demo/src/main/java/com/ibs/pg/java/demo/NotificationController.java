package com.ibs.pg.java.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YQ.Huang
 */
@RestController
@RequestMapping("/notification")
public class NotificationController {

    @PostMapping("/payment")
    public String onPaymentSucceed(@RequestBody String body) {
        System.out.println("Received Payment Notification: body = [" + body + "]");
        return "ok";
    }
}
