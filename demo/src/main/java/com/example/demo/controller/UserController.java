package com.example.demo.controller;

import com.example.demo.entity.*;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> createUser(@RequestBody User user) {
    	user=userService.createUser(user);
        return new ResponseEntity<User>(user,HttpStatus.ACCEPTED);
    }
//    @PostMapping("/register")
//    public User createUser(@RequestBody User user) {
//        return userService.createUser(user);
//    }

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
}
