package com.cyx.anno.config;

import com.cyx.anno.Car;
import com.cyx.anno.impl.Ford;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigA {
    @Bean(value="ford")
    public Car getFord(){
        return new Ford();
    }
}
