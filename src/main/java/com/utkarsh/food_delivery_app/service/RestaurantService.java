package com.utkarsh.food_delivery_app.service;

import com.utkarsh.food_delivery_app.entity.Restaurant;

import java.util.List;

public interface RestaurantService {
    Restaurant addRestaurant(Long ownerId, Restaurant restaurant);
    Restaurant getRestaurantById(Long id);
    List<Restaurant> getAllRestaurants();
    Restaurant updateRestaurant(Long id, Restaurant updatedRestaurant);
    void deleteRestaurant();
}
