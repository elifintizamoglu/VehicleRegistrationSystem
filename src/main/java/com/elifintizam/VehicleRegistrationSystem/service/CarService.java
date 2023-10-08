package com.elifintizam.VehicleRegistrationSystem.service;

import java.util.List;

import com.elifintizam.VehicleRegistrationSystem.car.Car;

public class CarService {
     public List<Car> getCars(){
        return List.of(
            new Car(1L, "First Car", "Audi", "A2", 2015, "31 AA 123")
        );
    }
}
