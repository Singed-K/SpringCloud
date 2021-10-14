package com.singed.springcloud.service;

import com.singed.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author : Singed
 * @create : 2021/10/14 1:54
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
