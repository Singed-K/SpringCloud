package com.singed.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author : Singed
 * @create : 2021/10/18 23:00
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001 {
    public static void main(String[] args) {
        //http://localhost:9001/hystrix
        //监听地址http://localhost:8001/hystrix.stream
        SpringApplication.run(HystrixDashboardMain9001.class, args);
    }
}
