package com.healthtrack.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.healthtrack")
public class HealthTrackApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(HealthTrackApiApplication.class, args);
    }
}