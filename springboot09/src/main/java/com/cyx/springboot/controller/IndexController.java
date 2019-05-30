package com.cyx.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping(value = "/hello2")
    @ResponseBody
    public String hello2(){
        return "hhhh";
    }
}
