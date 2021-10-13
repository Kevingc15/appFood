package com.appfood.appfood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class AppFoodApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppFoodApplication.class, args);
    }

}
