package com.example.kitchener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URISyntaxException;


@Configuration
@RestController
@SpringBootApplication
public class KitchenerApplication {

	private final KitchenerService kitchenerService;

	public KitchenerApplication(KitchenerService kitchenerService) {
		this.kitchenerService = kitchenerService;
	}

	public static void main(String[] args) {
		SpringApplication.run(KitchenerApplication.class, args);
	}

	@GetMapping("/cook-borscht")
	private String makeBorsch() throws URISyntaxException,
			IOException, InterruptedException {
		return kitchenerService.cookBorscht();
	}
}
