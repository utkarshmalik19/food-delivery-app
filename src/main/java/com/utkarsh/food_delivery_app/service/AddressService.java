package com.utkarsh.food_delivery_app.service;

import com.utkarsh.food_delivery_app.entity.Address;

import java.util.List;

public interface AddressService {
    Address addAddress(Long userId, Address address);
    Address getAddress(Long userId, Long addressId);
    List<Address> getAddressesByUser(Long userId);
    Address updateAddress(Long userId, Long addressId, Address updatedAddress);
    void deleteAddress(Long userId, Long addressId);
}
