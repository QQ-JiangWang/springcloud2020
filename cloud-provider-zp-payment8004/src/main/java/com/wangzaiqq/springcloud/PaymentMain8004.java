package com.wangzaiqq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Wangjiang
 * @create 2020-11-17 23:26
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8004 {
  public static void main(String[] args) {
    SpringApplication.run(PaymentMain8004.class,args);
  }
}
