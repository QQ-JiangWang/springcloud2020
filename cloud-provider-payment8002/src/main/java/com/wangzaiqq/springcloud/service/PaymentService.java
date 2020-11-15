package com.wangzaiqq.springcloud.service;

import com.wangzaiqq.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author Wangjiang
 * @create 2020-11-15 18:59
 */
public interface PaymentService {
  public int create(Payment payment); //写
  public Payment getPaymentById(@Param("id") Long id);  //读取
}
