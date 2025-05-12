package com.example.demo.controller;

import com.example.demo.entity.*;
import com.example.demo.serviceimpl.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/register")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable String id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/delete/{id}")
    public User deleteUser(@PathVariable String id) {
        return userService.deleteUser(id);
    }
    
    @GetMapping("/find")
    public List<User> getUser(@RequestParam String name) {
        return userService.getUserByName(name);
    }
    
}
