package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,String> {
	
	List<User> findByName(String name);
	User findByUserNameAndPassword(String userName,String password);

}
