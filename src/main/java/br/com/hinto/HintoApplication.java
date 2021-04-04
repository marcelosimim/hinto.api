package br.com.hinto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class HintoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HintoApplication.class, args);
	}
	
	@Bean
	public RestTemplate getFilmeRestTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
}
