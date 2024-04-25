package com.example.needthisbackend;

import jakarta.persistence.Entity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("model")
public class NeedThisBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(NeedThisBackendApplication.class, args);
    }

}
