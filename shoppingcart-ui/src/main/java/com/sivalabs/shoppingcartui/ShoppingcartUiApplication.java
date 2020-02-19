package com.sivalabs.shoppingcartui;

import com.sivalabs.shoppingcartui.filters.AuthHeaderFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import co.elastic.apm.attach.ElasticApmAttacher;
import org.springframework.boot.SpringApplication;

@EnableZuulProxy
//@EnableOAuth2Sso
@SpringBootApplication
public class ShoppingcartUiApplication {

    public static void main(String[] args) {
        ElasticApmAttacher.attach();
        SpringApplication.run(ShoppingcartUiApplication.class, args);
    }

    @Bean
    AuthHeaderFilter authHeaderFilter() {
        return new AuthHeaderFilter();
    }
}
