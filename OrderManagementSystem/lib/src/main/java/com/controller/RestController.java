package com.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@GetMapping
	public String greetMessage() {
		return "hello, vasudeep narra!";
	}

}
