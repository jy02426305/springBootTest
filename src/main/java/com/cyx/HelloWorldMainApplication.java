package com.cyx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication：标注一个主程序类，说明这是一个SpringBoot应用程序
 */
@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {
        /**
         * 使springBoot启动起来
         */
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
