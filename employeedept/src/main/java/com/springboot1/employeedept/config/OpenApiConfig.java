package com.springboot1.employeedept.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {

	 @Bean
	    public OpenAPI usersMicroserviceOpenAPI() {
	        return new OpenAPI()
	                .info(new Info().title("Employee and department docs")
	                                 .description("It provide the services related to employee and department entity")
	                                 .version("1.0"));
	    }
}