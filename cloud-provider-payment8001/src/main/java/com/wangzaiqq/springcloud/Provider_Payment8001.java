package com.wangzaiqq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Provider_Payment8001 {

  public static void main(String[] args) {
    SpringApplication.run(Provider_Payment8001.class, args);
  }

}
