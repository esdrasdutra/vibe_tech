package com.vibetech.hm.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWordController{

    @GetMapping("/hello")
    public String hello() {
        return ("Tudo isso, Deputado?\n");
    }
}