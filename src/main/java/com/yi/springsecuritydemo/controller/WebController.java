package com.yi.springsecuritydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;

@RestController
public class WebController {
    @GetMapping(value = "/time", produces = "application/json")
    public ZonedDateTime currentTime() {
        return ZonedDateTime.now();
    }

    @GetMapping(value = "/secret", produces = "application/json")
    public ZonedDateTime currentSecretTime() {
        return ZonedDateTime.now();
    }
}
