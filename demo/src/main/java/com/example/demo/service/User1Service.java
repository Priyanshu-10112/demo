package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.entity.User;

@Service
public interface User1Service {
	User findByUserNameAndPassword(String userName,String password);
	User processForm(String id , String name , String userName , String password);
	User createUser(User user);
	User getUserByUserName(String name);
}
