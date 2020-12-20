package com.roldan.mybooks.apiclient.v1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@RequestMapping(path = "/v1/books", produces = "application/json")
public class BookController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping
    public Map<String, Object> books() {
        return this.restTemplate.getForObject("http://my-books-api/v1/books", Map.class);
    }
}
