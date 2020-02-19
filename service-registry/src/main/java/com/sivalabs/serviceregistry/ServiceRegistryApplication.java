package com.sivalabs.serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import co.elastic.apm.attach.ElasticApmAttacher;
import org.springframework.boot.SpringApplication;

@EnableEurekaServer
@SpringBootApplication
public class ServiceRegistryApplication {

    public static void main(String[] args) {
        ElasticApmAttacher.attach();
        SpringApplication.run(ServiceRegistryApplication.class, args);
    }
}
