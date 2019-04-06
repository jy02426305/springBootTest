package com.cyx.anno.config;

import com.cyx.anno.impl.Buick;
import com.cyx.anno.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigB {
    @Bean("buick")
    public Car Buick(){
        return new Buick();
    }
}
