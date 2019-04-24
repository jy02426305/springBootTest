package com.cyx.springboot.controller;

import com.cyx.springboot.dto.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class PersonController {

    @RequestMapping(value="/hello")
    public Person hello(){
        Person person=new Person();
        person.setBirth(new Date());
        person.setName("张三");
        return person;
    }

    @RequestMapping(value="/hello2")
    public String hello2(){
        return "hello2";
    }
}
