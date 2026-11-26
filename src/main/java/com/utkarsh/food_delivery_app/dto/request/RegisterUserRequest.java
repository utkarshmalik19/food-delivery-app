package com.utkarsh.food_delivery_app.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record RegisterUserRequest(
        @NotBlank String name,
        @NotBlank @Email String email,
        @NotBlank @Pattern(regexp = "^[0-9]{10}$",message = "Phone no. must be 10 digits") String phone,
        @NotBlank @Size(min = 8) String password
) {
}
