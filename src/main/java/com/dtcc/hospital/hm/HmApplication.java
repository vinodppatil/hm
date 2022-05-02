package com.dtcc.hospital.hm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.*;

@SpringBootApplication
@EnableWebMvc
public class HmApplication {

	public static void main(String[] args) {
		SpringApplication.run(HmApplication.class, args);

	}



	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedMethods("*").allowedOrigins("*");
			}
		};
	}
}
