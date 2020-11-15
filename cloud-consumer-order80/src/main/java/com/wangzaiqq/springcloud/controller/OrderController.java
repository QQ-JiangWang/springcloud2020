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
  public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

  @Resource
  private RestTemplate restTemplate;

  @GetMapping("/consumer/payment/create")
  public CommonResult<Payment>   create(Payment payment){
    return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment, CommonResult.class);  //写操作
  }

  @GetMapping("/consumer/payment/get/{id}")
  public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
    return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
  }
}
