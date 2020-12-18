package com.roldan.mybooks.api.v1.contollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping(path = "/v1/books", produces = "application/json")
public class BookController {

    @GetMapping
    public Map<String, Object> books() {
        return Collections.singletonMap("books", Collections.singletonList("Black Swan"));
    }
}
