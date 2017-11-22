package com.ibs.ibspay.client;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author York Huang
 * @date 2017/11/14
 */

@Configuration
@EnableConfigurationProperties(IbspayProperties.class)
public class IbspayConfiguration {

    @Bean
    IbspayClient ibspayClient(IbspayProperties ibspay) {
        return new IbspayClient(ibspay.getUrl(), ibspay.getAccessKey(), ibspay.getAccessSecret());
    }

}
