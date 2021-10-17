package com.singed.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author : Singed
 * @create : 2021/10/17 21:38
 */
public interface LoadBalancer {
    ServiceInstance getInstance(List<ServiceInstance> instanceList);
}
