package com.cyx.springboot;

import com.cyx.springboot.dto.Person;
import com.cyx.springboot.dto.Person1;
import com.cyx.springboot.dto.Person2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot02ApplicationTests {
    @Autowired
    Person person;

    @Autowired
    Person1 person1;

    @Autowired
    Person2 person2;

    @Autowired
    ApplicationContext context;

    //@ConfigurationProperties的使用
    @Test
    public void contextLoads() {
        System.out.println(person.toString());
    }

    //@Value的使用
    @Test
    public void contextLoads2() {
        System.out.println(person1.toString());
    }

    //@PropertySource的使用
    @Test
    public void contextLoads3() {
        System.out.println(person2.toString());
    }

    //@ImportResource的使用
    @Test
    public void contextLoads4() {
        Object object=context.getBean("person3");
        System.out.println(object);
    }
}
