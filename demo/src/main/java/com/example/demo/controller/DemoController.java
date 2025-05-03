package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
@RestController
public class DemoController{
	String name=null,id=null;
	@RequestMapping("/name")
	public String getName(@RequestParam("un") String un) {
		name=un;
		return "Name is saved as "+name;
	}
	@RequestMapping("/id")
	public String getId(@RequestParam("ui") String ui) {
		id=ui;
		return "ID is saved as "+ui;
	}
	@RequestMapping("/info")
	public String getInfo() {
		return "Name of the user is "+name+" and Id of the user is "+id;
	}
	
}