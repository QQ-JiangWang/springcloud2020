package com.wangzaiqq.springcloud.controller;

import com.wangzaiqq.springcloud.entities.CommonResult;
import com.wangzaiqq.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author Wangjiang
 * @create 2020-11-15 20:34
 */
@RestController
@Slf4j
public class OrderController {
  public static final String INVOME_URL = "http://cloud-provider-payment";

  @Resource
  private RestTemplate restTemplate;

  @GetMapping("/consumer/payment/zk")
  public String payment (){
    String result = restTemplate.getForObject(INVOME_URL+"/payment/zk",String.class);
    return result;
  }
}
