package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User1;

@Repository
public interface User1Repo extends JpaRepository<User1, String> {
	    User1 findByUserNameAndPassword(String username, String password);
}
