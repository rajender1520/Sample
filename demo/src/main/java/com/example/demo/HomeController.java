package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {
	@RequestMapping("/hello")  
    public String hello(){ 
		System.out.println("Hello");
        return"Hello!";  
}
}