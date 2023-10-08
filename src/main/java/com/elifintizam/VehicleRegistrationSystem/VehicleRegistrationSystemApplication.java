package com.elifintizam.VehicleRegistrationSystem;
import com.elifintizam.VehicleRegistrationSystem.user.User;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VehicleRegistrationSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleRegistrationSystemApplication.class, args);
	}

	@GetMapping
	public List<User> users() {
		return List.of(
			new User(1L,"Elif","İntizam","elo","123") 
		);
	}



	
}
