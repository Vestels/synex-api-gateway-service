package com.synex.synexapigatewayservice.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfig {

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("synex-user-service", route -> route
                        .path("/api/v1/users/**")
                        .filters(filter -> filter.stripPrefix(2))
                        .uri("lb://synex-user-service"))
                .build();
    }
}
