package com.example.refrigerator;

import org.springframework.stereotype.Component;

@Component
public class RefrigeratorService {
    public String getVegetables() {
        return "ОВОЩИ";
    }
}
