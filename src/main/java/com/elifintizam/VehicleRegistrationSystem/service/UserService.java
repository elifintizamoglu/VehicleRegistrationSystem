package com.elifintizam.VehicleRegistrationSystem.service;

import java.util.List;

import com.elifintizam.VehicleRegistrationSystem.user.User;

public class UserService {
    public List<User> getUsers() {
		return List.of(
			new User(1L,"Elif","İntizam","elo","123") 
		);
	}
}
