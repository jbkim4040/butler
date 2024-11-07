package com.general.butler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class ButlerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ButlerApplication.class, args);
    }

}
