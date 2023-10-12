package com.elifintizam.VehicleRegistrationSystem.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.elifintizam.VehicleRegistrationSystem.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    @Query("SELECT c FROM Car c WHERE c.numberPlate=?1")
    Optional<Car> findCarByNumberPlate(String numberPlate);

    @Query("SELECT c FROM Car c WHERE c.model LIKE %:searchWord% OR c.brand LIKE %:searchWord%")
    List<Car> findCarsByModelOrBrand(String searchWord);
}
