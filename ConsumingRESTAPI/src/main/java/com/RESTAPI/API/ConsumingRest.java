package com.RESTAPI.API;

import com.RESTAPI.API.entity.ConsumingRestQuote;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@Slf4j
public class ConsumingRest {

	public static void main(String[] args) {
		SpringApplication.run(ConsumingRest.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder templateBuilder){
		return templateBuilder.build();
	}
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception{
		return args -> {
			ConsumingRestQuote quote = restTemplate.getForObject(
					"https://quoters.apps.pcfone.io/api/random",
					ConsumingRestQuote.class);
			log.info(quote.toString());
		};
	}

}
