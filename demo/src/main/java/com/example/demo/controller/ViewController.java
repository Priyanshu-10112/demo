package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.User1;
import com.example.demo.repository.User1Repo;

@Controller
public class ViewController {

    @Autowired
    private User1Repo userRepository;

    @GetMapping("/home")
    public String home() {
        return "index";
    }


    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String doLogin(@RequestParam String userName, @RequestParam String password, Model model) {
        User1 user = userRepository.findByUserNameAndPassword(userName, password);
        if (user != null) {
            model.addAttribute("user", user);
            return "info";
        } else {
            model.addAttribute("error", "Invalid credentials");
            return "login";
        }
    }

    @GetMapping("/register")
    public String register() {
        return "regis";
    }

    @PostMapping("/register")
    public String registerUser(
            @RequestParam("id") String id,
            @RequestParam("name") String name,
            @RequestParam("userName") String userName,
            @RequestParam("password") String password,
            @RequestParam("phNum") String phNum,
            @RequestParam("email") String email,
            Model model
    ) {
        User1 user = new User1();
        user.setId(id);
        user.setName(name);
        user.setUserName(userName);
        user.setPassword(password);
        user.setPhNum(phNum);
        user.setEmail(email);

        userRepository.save(user);
        model.addAttribute("message", "Registration successful!");
        return "redirect:/login";
    }

    @GetMapping("/menu")
    public String menu(Model model, @RequestParam String userName) {
        model.addAttribute("user", userRepository.findByUserName(userName));
        return "info";
    }
}
