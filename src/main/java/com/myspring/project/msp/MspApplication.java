package com.myspring.project.msp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;


@SpringBootApplication
public class MspApplication {

    public static void main(String[] args) {

//		SpringApplication.run(MspApplication.class, args);

        SpringApplication app = new SpringApplication(MspApplication.class);
        app.setDefaultProperties(Collections
                .singletonMap("server.port", "8083"));
        app.run(args);
    }


}
