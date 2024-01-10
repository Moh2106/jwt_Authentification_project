package com.mohdev.jwt_authentification_project.controller;

import com.mohdev.jwt_authentification_project.entities.User;
import com.mohdev.jwt_authentification_project.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public User registerNewUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/forAdmin")
    public String forAdmin(){
        return "This URL is for Admin";
    }

    @GetMapping("/forUsers")
    public String forUser(){
        return "This URL is for User";
    }
}
