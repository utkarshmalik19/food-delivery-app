package com.utkarsh.food_delivery_app.service.impl;

import com.utkarsh.food_delivery_app.dto.request.LoginRequest;
import com.utkarsh.food_delivery_app.dto.request.RegisterUserRequest;
import com.utkarsh.food_delivery_app.entity.User;
import com.utkarsh.food_delivery_app.mapper.UserMapper;
import com.utkarsh.food_delivery_app.repository.UserRepository;
import com.utkarsh.food_delivery_app.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    @Override
    public User registerUser(RegisterUserRequest user) {
        return userRepository.save(userMapper.toEntity(user));
    }

    @Override
    public Optional<User> loginUser(LoginRequest request) {
        Optional<User> loggedInUser = userRepository.findByEmail(request.email());
        if(loggedInUser.isEmpty()){
            return Optional.empty();
        }
        User user = loggedInUser.get();
        if(!user.getPassword().equals(request.password()))
            return Optional.empty();
        return loggedInUser;
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.getReferenceById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser() {

    }
}
