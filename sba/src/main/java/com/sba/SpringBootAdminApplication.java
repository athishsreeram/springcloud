package com.sba;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableAdminServer
@SpringBootApplication
public class SpringBootAdminApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringBootAdminApplication.class)
                .run(args);
    }
}