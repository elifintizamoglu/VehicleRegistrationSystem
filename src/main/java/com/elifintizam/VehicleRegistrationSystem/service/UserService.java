package com.elifintizam.VehicleRegistrationSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elifintizam.VehicleRegistrationSystem.model.User;
import com.elifintizam.VehicleRegistrationSystem.repository.UserRepository;

@Service
public class UserService {

	private final UserRepository userRepository;

	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public List<User> getUsers() {
		return userRepository.findAll();
	}

	public void addUser(User user) {
		Optional<User> userOptional = userRepository.findUserByUserName(user.getUserName());
		if (userOptional.isPresent()) {
			throw new IllegalStateException("Username is taken.");
		} else {
			userRepository.save(user);
		}
	}

	public void deleteUser(Long userId) {
		boolean exists = userRepository.existsById(userId);
		if (!exists) {
			throw new IllegalStateException("User with id " + userId + " does not exists.");
		}
		userRepository.deleteById(userId);
	}
}
