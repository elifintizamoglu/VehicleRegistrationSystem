package com.elifintizam.VehicleRegistrationSystem.car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private Long id;
    private String carName;
    private String brand;
    private String model;
    private int year;
    private String numberPlate;

    public Car(String carName, String brand, String model, int year, String numberPlate) {
        this.carName = carName;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.numberPlate = numberPlate;
    }

}
