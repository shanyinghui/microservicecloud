package com.buba.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class LoadBalanceConfig {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

   /* @Bean //采用随机策略代替ribbon默认的轮询策略
    public IRule getIRule(){
        return new RandomRule();
    }*/

   /* @Bean //采用随机策略代替ribbon默认的轮询策略
    public IRule getIRule(){
        return new RetryRule();
    }*/
}
