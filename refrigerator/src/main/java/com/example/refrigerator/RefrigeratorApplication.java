package com.example.refrigerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class RefrigeratorApplication {

	private final RefrigeratorService refrigeratorService;

    public RefrigeratorApplication(RefrigeratorService refrigeratorService) {
        this.refrigeratorService = refrigeratorService;
    }

    public static void main(String[] args) {
		SpringApplication.run(RefrigeratorApplication.class, args);
	}

	@GetMapping("/get-vegetables")
	String getVegetables() {
		return refrigeratorService.getVegetables();
	}

}
