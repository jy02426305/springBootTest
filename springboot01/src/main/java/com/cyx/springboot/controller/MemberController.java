package com.cyx.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    private Integer m=1;

    @RequestMapping(value = "/testOut2")
    public String testOut(){
        m=m+1;
        return m.toString();
    }
}
