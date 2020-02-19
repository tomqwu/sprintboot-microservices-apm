package com.sivalabs.inventoryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import co.elastic.apm.attach.ElasticApmAttacher;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
@EnableCircuitBreaker
public class InventoryServiceApplication {

    public static void main(String[] args) {
        ElasticApmAttacher.attach();
        SpringApplication.run(InventoryServiceApplication.class, args);
    }
}
