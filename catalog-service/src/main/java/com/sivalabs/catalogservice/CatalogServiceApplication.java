package com.sivalabs.catalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import co.elastic.apm.attach.ElasticApmAttacher;
import org.springframework.boot.SpringApplication;

@EnableFeignClients
@EnableCircuitBreaker
@SpringBootApplication
public class CatalogServiceApplication {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        ElasticApmAttacher.attach();
        SpringApplication.run(CatalogServiceApplication.class, args);
    }
}
