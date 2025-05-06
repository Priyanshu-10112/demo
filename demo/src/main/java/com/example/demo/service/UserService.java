package com.example.demo.service;

import com.example.demo.entity.User;
import java.util.List;

public interface UserService {
    User createUser(User user);
    List<User> getAllUsers();
    User updateUser(String id, User user);
    User deleteUser(String id);
}
