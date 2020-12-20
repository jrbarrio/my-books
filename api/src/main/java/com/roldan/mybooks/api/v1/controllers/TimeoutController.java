package com.roldan.mybooks.api.v1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Callable;

@RestController
@RequestMapping(path = "/v1/timeout", produces = "application/json")
public class TimeoutController {

    @GetMapping
    public Callable<String> getFoobar() throws InterruptedException {
        return () -> {
                Thread.sleep(1000); //this will cause a timeout
                return "foobar";
            };
    }
}
