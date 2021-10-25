package com.singed.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Singed
 * @create : 2021/10/25 23:57
 */
@RestController
@RefreshScope
public class ConfigClientController {
    /**
     * 调用以下url刷新config
     * curl -X POST "http://localhost:3355/actuator/refresh"
     */
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return configInfo;
    }
}
