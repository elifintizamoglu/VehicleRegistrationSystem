package com.elifintizam.VehicleRegistrationSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elifintizam.VehicleRegistrationSystem.model.Car;
import com.elifintizam.VehicleRegistrationSystem.repository.CarRepository;

@Service
public class CarService {

    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    public List<Car> getCars() {
        return carRepository.findAll();
                //new Car(1L, "First Car", "Audi", "A2", 2015, "31 AA 123"));
    }
}
