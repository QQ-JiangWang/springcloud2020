package com.wangzaiqq.springcloud.service.impl;

import com.wangzaiqq.springcloud.dao.PaymentDao;
import com.wangzaiqq.springcloud.entities.Payment;
import com.wangzaiqq.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Wangjiang
 * @create 2020-11-15 19:00
 */
@Service
public class PaymentServiceImpl implements PaymentService {
  @Resource
  private PaymentDao paymentDao;
  @Override
  public int create(Payment payment){
    return paymentDao.create(payment);
  }
  @Override
  public Payment getPaymentById( Long id){

    return paymentDao.getPaymentById(id);

  }
}
