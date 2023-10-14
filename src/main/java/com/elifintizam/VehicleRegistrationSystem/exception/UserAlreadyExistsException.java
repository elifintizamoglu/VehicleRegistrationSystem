package com.elifintizam.VehicleRegistrationSystem.exception;

public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException(String userName) {
        super("User with username " + userName + " already exists.");
    }
}
