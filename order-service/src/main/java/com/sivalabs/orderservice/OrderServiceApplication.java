package com.sivalabs.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

import co.elastic.apm.attach.ElasticApmAttacher;
import org.springframework.boot.SpringApplication;

@EnableCircuitBreaker
@SpringBootApplication
public class OrderServiceApplication {

	public static void main(String[] args) {
		ElasticApmAttacher.attach();
		SpringApplication.run(OrderServiceApplication.class, args);
	}
}
