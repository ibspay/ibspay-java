package com.ibs.pg.java;

import com.ibs.pg.java.utils.HttpUtils;
import com.ibs.pg.java.utils.JsonUtils;

public class PgClient {

    private final String baseUrl;

    public PgClient(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public Response initiate(InitiatePaymentRequest initiateRequest) {
        String json = JsonUtils.toJson(initiateRequest);
        String url = baseUrl + "/api/payment/initiate";
        String response = HttpUtils.doPost(url, json);
        return JsonUtils.fromJson(response, Response.class);
    }

    public String verify(VerifyPaymentRequest request) {
        String json = JsonUtils.toJson(request);
        String url = baseUrl + "/api/payment/verify";
        return HttpUtils.doPost(url, json);
    }
}
