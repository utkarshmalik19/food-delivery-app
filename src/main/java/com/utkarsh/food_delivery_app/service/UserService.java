package com.utkarsh.food_delivery_app.service;

import com.utkarsh.food_delivery_app.dto.request.LoginRequest;
import com.utkarsh.food_delivery_app.dto.request.RegisterUserRequest;
import com.utkarsh.food_delivery_app.entity.User;

import java.util.List;

public interface UserService {
    User registerUser(RegisterUserRequest user);
    User loginUser(LoginRequest user);
    User getUserById(Long id);
    List<User> getAllUsers();
    void deleteUser();
}
