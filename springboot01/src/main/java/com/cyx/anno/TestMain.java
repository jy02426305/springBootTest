package com.cyx.anno;

import com.cyx.anno.config.ParentConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ParentConfig.class);
        Car buick=(Car)context.getBean("buick");
        buick.print();
        Car ford=(Car)context.getBean("ford");
        ford.print();
    }
}
