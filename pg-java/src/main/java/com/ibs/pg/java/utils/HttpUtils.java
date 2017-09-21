package com.ibs.pg.java.utils;


import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HttpUtils {
    private HttpUtils() {
    }

    private static CloseableHttpClient httpClient = HttpClients.createDefault();

    public static String doPost(String url, String json) {

        HttpPost httpPost = new HttpPost(url);
        httpPost.setEntity(new StringEntity(json, ContentType.APPLICATION_JSON));

        return execute(httpPost);
    }

    private static String execute(HttpUriRequest request) {
        try {
            HttpResponse response = httpClient.execute(request);
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode >= 200 && statusCode <= 400) {
                return EntityUtils.toString(response.getEntity());
            } else {
                throw new RuntimeException("Unexpected Status Code: " + statusCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
