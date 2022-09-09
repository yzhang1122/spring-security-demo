package com.yi.springsecuritydemo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Map;

@RestController
public class WebController {

    private Authentication authentication;
    private JwtAuthenticationToken jwtAuthenticationToken;

    @GetMapping(value = "/time", produces = "application/json")
    public String currentTime(Principal principal) {
        return "ZonedDfffateTime.now()";
    }

    @GetMapping(value = "/secret", produces = "application/json")
    public String currentSecfretTime() {
        return "ZonedDatfdsfdseTifffme.now()";
    }
}
