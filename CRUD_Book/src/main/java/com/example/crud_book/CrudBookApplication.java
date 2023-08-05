package com.example.crud_book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CrudBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudBookApplication.class, args);
    }

}
