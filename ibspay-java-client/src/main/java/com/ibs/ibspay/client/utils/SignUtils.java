package com.ibs.ibspay.client.utils;

import com.ibs.ibspay.api.RequestAction;
import org.apache.commons.codec.digest.DigestUtils;

import java.io.UnsupportedEncodingException;

/**
 * @author York Huang
 */
public class SignUtils {
    private SignUtils() {
    }

    public static String sign(String key, RequestAction action, String nonce, String body, String secret) {
        String signString = key + action + nonce + body + secret;
        try {
            return DigestUtils.md5Hex(signString.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

}
