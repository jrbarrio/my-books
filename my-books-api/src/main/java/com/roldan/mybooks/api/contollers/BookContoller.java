package com.roldan.mybooks.api.contollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping(path = "/books", produces = "application/json")
public class BookContoller {

    @GetMapping
    public Iterable<String> books() {
        return Collections.singletonList("Black Swan");
    }
}
