package com.cyx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello(){
        return "hello world";
    }
}
