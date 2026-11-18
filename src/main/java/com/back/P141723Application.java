package com.back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class P141723Application {

    public static void main(String[] args) {
        SpringApplication.run(P141723Application.class, args);
    }

}
