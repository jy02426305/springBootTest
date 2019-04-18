package com.cyx.springboot.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.List;
import java.util.Map;

@Component
@Validated
public class Person1 {

    @Value("${person.name}")
    private String name;
    @Value("#{person.age*2}")
    private int age;
    //@Value不支持复杂类型映射
    private Map<String,String> maps;

    private List<String> list;
    @Value("${person.english-name}")
    private String englishName;

    private Dog dog;

    @Value("${person.email}")
    //@Email  不支持校验
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", maps=" + maps +
                ", list=" + list +
                ", englishName='" + englishName + '\'' +
                ", dog=" + dog +
                ", email='" + email + '\'' +
                '}';
    }
}
