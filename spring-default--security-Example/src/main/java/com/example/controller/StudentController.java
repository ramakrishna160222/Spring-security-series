package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	
	@GetMapping("/public")
	public String publicPage() {
		return "This is a public page 😊😊😊😊";
	}
	
	@GetMapping("/private")
	public String privatePage() {
		return "You are landed in a private Page 😁😁 Finally (--)";
	}
}
