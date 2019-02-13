package com.mufg.tbcc.WelcomeDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
@Controller
public class WelcomeDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WelcomeDemoApplication.class, args);
	}

	@GetMapping("")
	public String welcomePage(HttpServletRequest request) {
		return "index";
	}


}

