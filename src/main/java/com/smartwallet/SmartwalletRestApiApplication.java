package com.smartwallet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmartwalletRestApiApplication {

    public static void main(String[] args) {

        SpringApplication.run(
                SmartwalletRestApiApplication.class,
                args
        );
    }
}