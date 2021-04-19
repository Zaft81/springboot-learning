package com.example.springbootshutdown;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootShutdownApplication {

    public static void main(String[] args) {
        System.out.println("123");
        SpringApplication.run(SpringbootShutdownApplication.class, args);
    }

}
