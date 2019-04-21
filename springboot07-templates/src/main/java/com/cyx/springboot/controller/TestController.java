package com.cyx.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping(value="/index")
    public String index(Model model){
        model.addAttribute("province","福建省");
        return "index";
    }

    @RequestMapping(value="/rebang")
    public String rebang(){
        return "rebang";
    }
}
