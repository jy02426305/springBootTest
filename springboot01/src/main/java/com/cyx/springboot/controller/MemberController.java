package com.cyx.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class MemberController {
    private AtomicInteger m=new AtomicInteger(1);

    @RequestMapping(value = "/testOut2")
    public String testOut(){
        int m1=m.addAndGet(1);
        return String.valueOf(m1);
    }
}
