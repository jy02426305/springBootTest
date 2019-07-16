package com.cyx.springboot;

import net.unicon.cas.client.configuration.EnableCasClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableCasClient
public class Springboot12CasClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot12CasClientApplication.class, args);
    }

}
