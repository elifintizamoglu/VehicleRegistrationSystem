package com.elifintizam.VehicleRegistrationSystem.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elifintizam.VehicleRegistrationSystem.car.Car;

@RestController
@RequestMapping(path = "api/v1/car")
public class CarController {

    @GetMapping
    public List<Car> getCars(){
        return List.of(
            new Car(1L, "First Car", "Audi", "A2", 2015, "31 AA 123")
        );
    }
    
}
