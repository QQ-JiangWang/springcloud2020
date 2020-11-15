package com.wangzaiqq.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Wangjiang
 * @create 2020-11-15 20:33
 */
@Configuration
public class ApplicationContextConfig {
  @Bean
  @LoadBalanced
  public RestTemplate getRestTemplate(){
    return new RestTemplate();
  }
}
