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
            return new PgClient(properties.getBaseUrl());
        }

        @Validated
        @ConfigurationProperties(prefix = "pg")
        public static class Properties {
            /**
             * Base Url for Payment Gateway
             */
            @NotBlank
            private String baseUrl;

            public String getBaseUrl() {
                return baseUrl;
            }

            public void setBaseUrl(String baseUrl) {
                this.baseUrl = baseUrl;
            }
        }
    }
}
