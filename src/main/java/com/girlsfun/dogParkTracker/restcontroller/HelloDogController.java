package com.girlsfun.dogParkTracker.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.NoSuchElementException;

@RestController
public class HelloDogController {
    @GetMapping("/hello/{dogName}")
    String getDogById(@PathVariable String dogName) {
        return "Hello " + dogName + " you look pawsome!";
    }
}
