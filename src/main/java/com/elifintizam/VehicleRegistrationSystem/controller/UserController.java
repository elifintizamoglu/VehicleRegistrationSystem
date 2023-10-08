package com.elifintizam.VehicleRegistrationSystem.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elifintizam.VehicleRegistrationSystem.user.User;

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {

    @GetMapping
	public List<User> getUsers() {
		return List.of(
			new User(1L,"Elif","İntizam","elo","123") 
		);
	}
}
