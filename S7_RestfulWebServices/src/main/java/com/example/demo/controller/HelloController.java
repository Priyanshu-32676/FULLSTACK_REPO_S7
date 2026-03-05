package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
	
	@GetMapping("/")
	public String home() {
		return "This is a home page";
	}
	@GetMapping("/myurl")
	   public String sayHello()
	   {
		   return "Welcome to springBoot programming";
	   }
	@GetMapping("/cse")
	public String cseDept() {
		return " This is CSE department Home Page";
	}
}
