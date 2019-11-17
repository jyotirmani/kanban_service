package com.kanban.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {
	
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.kanban"))
//				.paths(regex("/rest.*"))
				.build()
				.apiInfo(apiDetails());
	}
	
	
	private ApiInfo apiDetails() {
		return new ApiInfo(
				"Kanban State info",
				"Sample API for state information",
				"1.0",
				"Free to use",
				new springfox.documentation.service.Contact("Jyotirmani", "http://wipro.com" , "Jyotirmani@wipro.com"),
				"API License",
				"http:localhost:8088",
				Collections.emptyList());
	}

}
