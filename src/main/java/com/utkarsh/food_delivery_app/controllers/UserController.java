package com.utkarsh.food_delivery_app.controllers;

import com.utkarsh.food_delivery_app.dto.request.LoginRequest;
import com.utkarsh.food_delivery_app.dto.request.RegisterUserRequest;
import com.utkarsh.food_delivery_app.entity.User;
import com.utkarsh.food_delivery_app.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody RegisterUserRequest request){
        return ResponseEntity.ok(userService.registerUser(request));
    }
    @GetMapping("/login")
    public ResponseEntity<Optional<User>> loginUser(@RequestBody LoginRequest request){
        return ResponseEntity.ok(userService.loginUser(request));
    }
}
