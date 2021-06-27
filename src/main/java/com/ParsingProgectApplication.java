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

		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl
				= "https://cbr.ru/scripts/XML_dynamic.asp?date_req1=02/03/2001&date_req2=14/03/2001&VAL_NM_RQ=R01235";
		ResponseEntity<String> response
				= restTemplate.getForEntity(fooResourceUrl + "/1", String.class);
		System.out.println(response);
	}
}
