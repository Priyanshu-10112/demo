package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.User;
import com.example.demo.serviceimpl.UserServiceImpl;

@RestController
public class DemoController {

    @Autowired
    UserServiceImpl userServiceImpl;

    @PostMapping("/create")
    public String createUser(@RequestBody User user) {
    	user= userServiceImpl.createUser(user);
        return user.toString();
    }

}