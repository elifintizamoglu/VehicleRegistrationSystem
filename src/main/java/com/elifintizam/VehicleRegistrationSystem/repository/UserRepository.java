package com.elifintizam.VehicleRegistrationSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elifintizam.VehicleRegistrationSystem.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
