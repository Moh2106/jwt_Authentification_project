package com.mohdev.jwt_authentification_project.service;

import com.mohdev.jwt_authentification_project.entities.User;
import com.mohdev.jwt_authentification_project.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }
}
