package com.utkarsh.food_delivery_app.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record OrderItemRequest(@NotNull Long menuItemId, @Min(1) int quantity) {
}
