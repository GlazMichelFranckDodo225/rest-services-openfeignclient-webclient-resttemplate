package com.dgmf.config;

import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ProjectConfiguration {

    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor(
                "admin@gmail.com", "*ruTuch7D7ub"
        );
    }

    @Bean
    public RestTemplate restTemplate() {
        RestTemplateBuilder restTemplateBuilder =
                new RestTemplateBuilder();
        return restTemplateBuilder.basicAuthentication
                ("admin@gmail.com", "*ruTuch7D7ub").build();
    }
}
