package com.example.cupboard;


import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class StarterConfiguration {
    @Bean
    CupboardService cupboardService() {
        return new CupboardService();
    }
}
