package com.singed.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Singed
 * @create : 2021/10/22 22:42
 */
@Configuration
public class GateWayConfig {
    /**
     * 配置一个id为route-name的路由规则
     * 当访问地址为http://localhost:9527/guonei时会自动转发到地址http://news.baidu.com/guonei
     * @param routeLocatorBuilder builder
     * @return
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_xk",
                r -> r.path("/guonei")
                        .uri("http://news.baidu.com/guonei")).build();
        return routes.build();
    }
}
