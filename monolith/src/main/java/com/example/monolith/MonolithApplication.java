package com.example.monolith;

import com.example.kitchener.KitchenerService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.kitchener.KitchenConnector;

import java.io.IOException;
import java.net.URISyntaxException;

@RestController
@SpringBootApplication
@RequiredArgsConstructor
public class MonolithApplication {

    private final KitchenerService kitchenerService;

    public static void main(String[] args) {
        SpringApplication.run(MonolithApplication.class, args);
    }

    @GetMapping("/get-borsch")
    String getBorsch() throws URISyntaxException,
            IOException, InterruptedException {
        return kitchenerService.cookBorscht();
    }
}

