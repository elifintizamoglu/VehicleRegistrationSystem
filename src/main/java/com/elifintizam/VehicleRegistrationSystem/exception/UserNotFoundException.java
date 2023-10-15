package com.elifintizam.VehicleRegistrationSystem.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException() {
        super("User could not found!");
    }
}
