package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.User;
import com.example.demo.serviceimpl.UserServiceImpl;

@Controller
public class ViewController {
	 @Autowired
	private UserServiceImpl userService;
	@RequestMapping("/home")
	public String home() {
		return "index";
	}
	@RequestMapping("/regis")
	public String register(){
		return "regis";
	}
	 @PostMapping("/register")
	    public String processForm(@RequestParam String id ,@RequestParam String name ,@RequestParam String userName ,@RequestParam String password) {
		 	User user=userService.processForm(id, name, userName, password);
		 	if(user!=null)System.out.println("Registered");
		 	return "redirect:/login";
	    }
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	@PostMapping("/log")
    public String logForm(@RequestParam String userName ,@RequestParam String password) {
	 	userService.findByUserNameAndPassword(userName, password);
	 	return "index";
    }
	
}
