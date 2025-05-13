package com.example.demo.serviceimpl;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.service.User1Service;

@Service
public class User1ServiceImpl implements User1Service {

	@Override
	public User findByUserNameAndPassword(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User processForm(String id, String name, String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByUserName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
