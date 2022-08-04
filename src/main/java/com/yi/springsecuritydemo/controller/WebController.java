package com.yi.springsecuritydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class WebController {

    @GetMapping(value = "/time", produces = "application/json")
    public String currentTime(Principal principal) {
        return "ZonedDateTime.now()";
    }

    @GetMapping(value = "/secret", produces = "application/json")
    public String currentSecretTime() {
        return "ZonedDateTime.now()";
    }
}
