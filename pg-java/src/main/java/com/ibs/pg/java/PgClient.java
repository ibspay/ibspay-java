package com.ibs.pg.java;

import com.ibs.pg.java.model.InitiatePaymentRequest;
import com.ibs.pg.java.model.Response;
import com.ibs.pg.java.model.VerifyPaymentRequest;
import com.ibs.pg.java.utils.HttpUtils;
import com.ibs.pg.java.utils.JsonUtils;

public class PgClient {

    public Response initiate(InitiatePaymentRequest initiateRequest) {
        String json = JsonUtils.toJson(initiateRequest);
        String url = "http://59.110.8.169:8180/api/payment/initiate";
        String response = HttpUtils.doPost(url, json);
        return JsonUtils.fromJson(response, Response.class);
    }

    public String verify(VerifyPaymentRequest request) {
        String json = JsonUtils.toJson(request);
        String url = "http://59.110.8.169:8180/api/payment/verify";
        return HttpUtils.doPost(url, json);
    }
}
