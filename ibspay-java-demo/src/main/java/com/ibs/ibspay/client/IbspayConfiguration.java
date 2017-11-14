package com.ibs.ibspay.client;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

/**
 * @author York Huang
 * @date 2017/11/14
 */

@Configuration
@EnableConfigurationProperties(IbspayConfiguration.Properties.class)
public class IbspayConfiguration {

    @Bean
    IbspayClient ibspayClient(Properties ibspay) {
        return new IbspayClient(ibspay.getBaseUrl(), ibspay.getKeyId(), ibspay.getKeySecret());
    }

    @Validated
    @ConfigurationProperties(prefix = "ibspay")
    public static class Properties {
        /**
         * Base Url for IBSPay
         */
        @NotBlank
        private String baseUrl;

        /**
         * Access Key ID for IBSPay
         */
        @NotBlank
        private String keyId;

        /**
         * Access Key Secret for IBSPay
         */
        @NotBlank
        private String keySecret;

        /**
         * Url for Payment Notification
         */
        @NotBlank
        private String paymentNotifyUrl;

        /**
         * Url for Refund Notification
         */
        @NotBlank
        private String refundNotifyUrl;

        public String getBaseUrl() {
            return baseUrl;
        }

        public void setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
        }

        public String getKeyId() {
            return keyId;
        }

        public void setKeyId(String keyId) {
            this.keyId = keyId;
        }

        public String getKeySecret() {
            return keySecret;
        }

        public void setKeySecret(String keySecret) {
            this.keySecret = keySecret;
        }

        public String getPaymentNotifyUrl() {
            return paymentNotifyUrl;
        }

        public void setPaymentNotifyUrl(String paymentNotifyUrl) {
            this.paymentNotifyUrl = paymentNotifyUrl;
        }

        public String getRefundNotifyUrl() {
            return refundNotifyUrl;
        }

        public void setRefundNotifyUrl(String refundNotifyUrl) {
            this.refundNotifyUrl = refundNotifyUrl;
        }
    }
}
