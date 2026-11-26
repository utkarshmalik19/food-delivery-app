package com.utkarsh.food_delivery_app.dto.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record PlaceOrderRequest(@NotNull Long userId, @NotNull Long restaurantId, @NotNull Long deliveryAddressId, @NotEmpty @Valid
List<OrderItemRequest> items, String specialInstructions) {
}
