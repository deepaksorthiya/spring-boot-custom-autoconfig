package com.example;

import com.example.api.LogApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootCustomAutoConfig {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootCustomAutoConfig.class, args);
        applicationContext.getBeansOfType(LogApi.class).forEach((k, v) -> System.out.println("KEY: " + k + " VALUE: " + v));
    }

    @Bean
    public CommandLineRunner commandLineRunner(LogApi logapi) {

        return args -> {
            logapi.generate("dlog");
        };

    }

}
