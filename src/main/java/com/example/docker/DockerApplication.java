package com.example.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerApplication.class, args);
	}

	@RestController
	static class BootController {

		@GetMapping("/{name}")
		public ResponseEntity<String> greet(@PathVariable(value = "name") String name) {
			return ResponseEntity.ok("Hey " + name + ", how are you doing?");
		}

	}

}
