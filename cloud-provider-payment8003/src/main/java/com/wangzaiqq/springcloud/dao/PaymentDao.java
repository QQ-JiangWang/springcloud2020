package com.wangzaiqq.springcloud.dao;

import com.wangzaiqq.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


/**
 * @author Wangjiang
 * @create 2020-11-15 18:43
 */
@Mapper
public interface PaymentDao {
  public int create(Payment payment);
  public Payment getPaymentById(@Param("id") Long id);
}
