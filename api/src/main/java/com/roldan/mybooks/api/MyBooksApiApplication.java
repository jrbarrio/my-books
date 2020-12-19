package com.roldan.mybooks.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MyBooksApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBooksApiApplication.class, args);
    }

}
