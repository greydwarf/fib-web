package com.example.fibweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.fibweb"})
public class FibWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(FibWebApplication.class, args);
    }

}
