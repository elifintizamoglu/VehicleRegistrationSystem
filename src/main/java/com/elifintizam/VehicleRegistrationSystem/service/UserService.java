package com.elifintizam.VehicleRegistrationSystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.elifintizam.VehicleRegistrationSystem.user.User;

@Service
public class UserService {

    public List<User> getUsers() {
		return List.of(
			new User(1L,"Elif","İntizam","elo","123") 
		);
	}
}
