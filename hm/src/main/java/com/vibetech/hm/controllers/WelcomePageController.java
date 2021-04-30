package com.vibetech.hm.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WelcomePageController{

    @GetMapping("/")
    public String hello() {
        return ("Olá, Tudo bem? \n");
    }
}