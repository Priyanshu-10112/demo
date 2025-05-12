package com.example.demo.service;

import com.example.demo.entity.User;
import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

public interface UserService {
    User createUser(User user);
    List<User> getAllUsers();
    User updateUser(String id, User user);
    User deleteUser(String id);
	List<User> getUserByName(String name);
	User findByUserNameAndPassword(String userName,String password);
	User processForm(String id , String name , String userName , String password);
}
