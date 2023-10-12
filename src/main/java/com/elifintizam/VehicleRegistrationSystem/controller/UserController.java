package com.elifintizam.VehicleRegistrationSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elifintizam.VehicleRegistrationSystem.model.User;
import com.elifintizam.VehicleRegistrationSystem.service.UserService;

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping
	public List<User> getUsers() {
        return userService.getUsers();
	}

    @PostMapping
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }
}
