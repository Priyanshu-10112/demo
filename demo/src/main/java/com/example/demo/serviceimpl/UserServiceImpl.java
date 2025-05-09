package com.example.demo.serviceimpl;

import com.example.demo.entity.User;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.repository.UserRepo;
import com.example.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    
	@Autowired
	private UserRepo userRepo;
	
	List<User> users;

    @Override
    public User createUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }
    @Override
  	public User updateUser(String id, User user){
   		User user1 =userRepo.findById(id).get();
   		if(user!=null){
   			user1.setName(user.getName());
    		user1.setUserName(user.getUserName());
    		user1.setPassword(user.getPassword());
    		return userRepo.save(user1); 
    	}
    	throw new UserNotFoundException("User with ID " + id + " not found.");
    }

    @Override
    public User deleteUser(String id) {
    	User user=userRepo.findById(id).get();
            if (user != null) {
                userRepo.delete(user);
                return user;
            }
        throw new UserNotFoundException("This id:"+id+" do not exist,Please add this Id or change Id");
    }
}
