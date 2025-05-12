package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
	
	@RequestMapping("/home")
	public String home() {
		return "index";
	}
	@RequestMapping("/regis")
	public String register() {
		return "regis";
	}
	@RequestMapping("/login")
	public String loginr() {
		return "login";
	}
}
