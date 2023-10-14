package com.elifintizam.VehicleRegistrationSystem.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long userId) {
        super("User with id " + userId + " could not found!");
    }
}
