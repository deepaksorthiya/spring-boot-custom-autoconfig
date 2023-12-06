package com.example;

import com.example.api.LogApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootCustomAutoConfig {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCustomAutoConfig.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(LogApi logapi) {
		
		return args -> { logapi.generate("dlog"); };
		
	}
	
}
