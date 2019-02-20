package com.mufg.tbcc.appA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
@Controller
public class WelcomeDemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(WelcomeDemoApplication.class, args);
	}

	@GetMapping("")
	public String welcomePage(HttpServletRequest request) {
		return "index";
	}


	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(WelcomeDemoApplication.class);
	}
}

