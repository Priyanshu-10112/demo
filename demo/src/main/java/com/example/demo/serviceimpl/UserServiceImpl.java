package com.example.demo.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    List<User> al = new ArrayList<>();
    @Override
    public User createUser(User user)
    {
    	System.out.println("Service Class Working");
        al.add(user);
		return user;
	}
}