package com.ibs.pg.java.demo;

import com.ibs.pg.java.PgClient;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

@SpringBootApplication
public class PgJavaDemo {
    public static void main(String[] args) {
        SpringApplication.run(PgJavaDemo.class, args);
    }

    @Configuration
    @EnableConfigurationProperties(Config.Properties.class)
    public static class Config {

        @Bean
        PgClient pgClient(Properties properties) {
            return new PgClient(properties.getPgBaseUrl());
        }

        @Validated
        @ConfigurationProperties
        public static class Properties {
            /**
             * Base Url for Payment Gateway
             */
            @NotBlank
            private String pgBaseUrl;

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

            public String getPgBaseUrl() {
                return pgBaseUrl;
            }

            public void setPgBaseUrl(String pgBaseUrl) {
                this.pgBaseUrl = pgBaseUrl;
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
}
