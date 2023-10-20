package com.elifintizam.VehicleRegistrationSystem.exception;

public class CarsNotFoundException extends RuntimeException {
    public CarsNotFoundException(){
        super("Cars not found!");
    }
}
