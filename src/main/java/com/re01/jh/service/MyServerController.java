package com.re01.jh.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyServerController {
    @GetMapping(value = "/sendInfo")
    public String sendInfo(){
        return "aa";
    }
}
