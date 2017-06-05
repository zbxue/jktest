package com.example.jktest.jktest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class JktestApplication {
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "hello jk!";
	}

	public static void main(String[] args) {
		Object[] objects = {JktestApplication.class, UserAction.class};
		SpringApplication.run( objects, args);
	}
}
