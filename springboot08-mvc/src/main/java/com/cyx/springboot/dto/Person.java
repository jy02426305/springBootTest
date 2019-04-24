package com.cyx.springboot.dto;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class Person {
    private String name;
    @JSONField(format = "yyyy-MM-dd")
    private Date birth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
