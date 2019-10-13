package com.VT.demo.spring.boot.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class VtApplication {
	
	@GetMapping("/message")
	public String getmessage() {
		return "Hello I am Vikas Tiwari";
	}

	public static void main(String[] args) {
		SpringApplication.run(VtApplication.class, args);
	}

}
