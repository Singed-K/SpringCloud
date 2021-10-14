package com.singed.springcloud.service.impl;

import com.singed.springcloud.dao.PaymentDao;
import com.singed.springcloud.entities.Payment;
import com.singed.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author : Singed
 * @Date : 2021/10/14 1:55
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
