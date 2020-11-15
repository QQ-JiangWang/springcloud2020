package com.wangzaiqq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * @author Wangjiang
 * @create 2020-11-15 22:33
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002 {
  public static void main(String[] args) {
    SpringApplication.run(EurekaMain7002.class,args);
  }
}
