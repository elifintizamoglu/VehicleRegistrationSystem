package com.elifintizam.VehicleRegistrationSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.elifintizam.VehicleRegistrationSystem.model.User;
import com.elifintizam.VehicleRegistrationSystem.service.UserServiceImpl;

@RestController
@RequestMapping(path = "user")
public class UserController {

    private final UserServiceImpl userService;

    @Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/all")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping(path = "/getById/{userId}")
    public User getUserById(@PathVariable("userId") Long userId) {
        return userService.getUserById(userId);
    }

    @PostMapping(path = "/add")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @DeleteMapping(path = "/delete/{userId}")
    public void deleteUser(@PathVariable("userId") Long userId) {
        userService.deleteUser(userId);
    }

    @PutMapping(path = "/update/{userId}")
    public void updateUserPassword(@PathVariable("userId") Long userId,
            @RequestParam(required = true) String oldPassword,
            @RequestParam(required = true) String newPassword) {
        userService.updateUserPassword(userId, oldPassword, newPassword);
    }
}
