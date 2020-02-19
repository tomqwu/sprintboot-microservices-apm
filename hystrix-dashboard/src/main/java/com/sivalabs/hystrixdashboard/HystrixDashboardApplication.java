package com.sivalabs.hystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import co.elastic.apm.attach.ElasticApmAttacher;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
@EnableHystrixDashboard
@EnableTurbine
public class HystrixDashboardApplication {

    public static void main(String[] args) {
        ElasticApmAttacher.attach();
        SpringApplication.run(HystrixDashboardApplication.class, args);
    }
}
