package com.elifintizam.VehicleRegistrationSystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.elifintizam.VehicleRegistrationSystem.car.Car;

@Service
public class CarService {

    public List<Car> getCars() {
        return List.of(
                new Car(1L, "First Car", "Audi", "A2", 2015, "31 AA 123"));
    }
}
