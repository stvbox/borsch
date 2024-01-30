package com.example.refrigerator;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;


@AutoConfiguration
public class StarterConfiguration {
    @Bean
    RefrigeratorService refrigeratorService() {
        return new RefrigeratorService();
    }
}
