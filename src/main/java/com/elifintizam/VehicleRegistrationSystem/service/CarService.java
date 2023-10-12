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
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getCars() {
        return carRepository.findAll();
    }

    public void addCar(Car car) {
        carRepository.save(car);
    }

    public void deleteCar(Long carId) {
        boolean exists = carRepository.existsById(carId);
        if (!exists) {
            throw new IllegalStateException("Car with id " + carId + " does not exists.");
        }
        carRepository.deleteById(carId);
    }
}
