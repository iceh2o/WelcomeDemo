package com.mufg.tbcc.appA;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultRestController {

    @RequestMapping("/status")
    public String status() {
        return "OK";
    }
}
