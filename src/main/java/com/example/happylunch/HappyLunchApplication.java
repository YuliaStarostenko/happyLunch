package com.example.happylunch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class HappyLunchApplication {

    public static void main(String[] args) {
        SpringApplication.run(HappyLunchApplication.class, args);
    }

}
