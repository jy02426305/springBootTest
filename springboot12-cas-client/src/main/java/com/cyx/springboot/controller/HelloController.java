package com.cyx.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(value = "/hello")
    public String hello(){
        String[] split = "123|abc".split("\\|");
        System.out.println(split[1]);
        return "hello";
    }
}
