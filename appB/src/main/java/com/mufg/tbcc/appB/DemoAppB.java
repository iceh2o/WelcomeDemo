package com.mufg.tbcc.appB;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import javax.validation.Valid;


@SpringBootApplication
@RestController
public class DemoAppB extends SpringBootServletInitializer {


    @Value("${app.name}")
    String appName;

    public static void main(String args[]) {
        SpringApplication.run(DemoAppB.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DemoAppB.class);
    }

    @RequestMapping("/appB")
    public String appB() {
        return appName;
    }
}
