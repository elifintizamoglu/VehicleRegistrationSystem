package com.elifintizam.VehicleRegistrationSystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.elifintizam.VehicleRegistrationSystem.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
    @Query("SELECT u FROM User u WHERE u.userName=?1")
    Optional<User> findUserByUserName(String userName);
}
