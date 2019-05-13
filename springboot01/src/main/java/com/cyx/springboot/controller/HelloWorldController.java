package com.cyx.springboot.controller;

import com.cyx.springboot.dto.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.sound.midi.Soundbank;

@RestController
public class HelloWorldController {
    private Integer n=1;

    @RequestMapping(value = "/hello")
//    @ResponseBody
    public String hello(){
        return "hello world";
    }

    @RequestMapping(value="/hello2")
//    @ResponseBody
    public Person hello2(){
        Person person=new Person();
        person.setName("张三");
        person.setAge(30);
        return person;
    }

    @RequestMapping(value = "/testOut")
    public String testOut(){
        n=n+1;
        return n.toString();
    }
}
