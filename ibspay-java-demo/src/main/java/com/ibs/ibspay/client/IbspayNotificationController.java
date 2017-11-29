package com.ibs.ibspay.client;

import com.ibs.ibspay.common.util.SignUtils;
import org.springframework.web.bind.annotation.*;

/**
 * @author YQ.Huang
 */
@RestController
@RequestMapping("/notification")
public class IbspayNotificationController {

    private final IbspayProperties props;

    public IbspayNotificationController(IbspayProperties props) {
        this.props = props;
    }

    @PostMapping("/payment")
    public String onPaymentSucceed(@RequestHeader("x-ibspay-key") String key,
                                   @RequestHeader("x-ibspay-nonce") String nonce,
                                   @RequestHeader("x-ibspay-sign") String sign,
                                   @RequestBody String body) {
        System.out.println("Received Payment Notification: body = [" + body + "]");
        boolean verify = SignUtils.verify(sign, key, nonce, body, props.getAccessSecret());
        System.out.println("verify = " + verify);
        return "ok";
    }

    @PostMapping("/refund")
    public String onRefundSucceed(@RequestHeader("x-ibspay-key") String key,
                                  @RequestHeader("x-ibspay-nonce") String nonce,
                                  @RequestHeader("x-ibspay-sign") String sign,
                                  @RequestBody String body) {
        System.out.println("Received Refund Notification: body = [" + body + "]");
        boolean verify = SignUtils.verify(sign, key, nonce, body, props.getAccessSecret());
        System.out.println("verify = " + verify);
        return "ok";
    }
}
