package com.elifintizam.VehicleRegistrationSystem.service;

import java.util.List;

import com.elifintizam.VehicleRegistrationSystem.model.User;

public interface IUserService {
    List<User> getUsers();

    User getUserById(Long userId);

    void addUser(User user);

    void deleteUser(Long userId);

    void updateUserPassword(Long userId, String oldPassword, String newPassword);
}
