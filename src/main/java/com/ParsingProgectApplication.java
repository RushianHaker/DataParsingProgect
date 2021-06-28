package com;

import com.entity.Rub;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ParsingProgectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParsingProgectApplication.class, args);
	}
}
