package com.utkarsh.food_delivery_app.service;

import com.utkarsh.food_delivery_app.dto.request.PlaceOrderRequest;
import com.utkarsh.food_delivery_app.entity.Order;

public interface OrderService {
    Order placeOrder(PlaceOrderRequest request);
    Order getOrderById(Long id);
    Order cancelOrder(Long orderId, Long userId);
}
