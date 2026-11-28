package com.utkarsh.food_delivery_app.mapper;

import com.utkarsh.food_delivery_app.dto.request.RegisterUserRequest;
import com.utkarsh.food_delivery_app.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public User toEntity(RegisterUserRequest request){
        User user = new User();
        user.setName(request.name());
        user.setEmail(request.email());
        user.setPassword(request.password());
        user.setPhone(request.phone());
        return user;
    }
}
