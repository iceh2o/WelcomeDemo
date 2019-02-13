package com.mufg.tbcc.WelcomeDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultRestController {

    @RequestMapping("/status")
    public String status() {
        return "OK";
    }
}
