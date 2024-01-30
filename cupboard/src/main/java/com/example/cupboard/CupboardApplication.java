package com.example.cupboard;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@RequiredArgsConstructor
public class CupboardApplication {

	private final CupboardService cupboardService;

	public static void main(String[] args) {
		SpringApplication.run(CupboardApplication.class, args);
	}

	@GetMapping("/get-pot")
	String getPot() {
		return cupboardService.getPot();
	}

}
