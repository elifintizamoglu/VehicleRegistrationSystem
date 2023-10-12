package com.elifintizam.VehicleRegistrationSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
