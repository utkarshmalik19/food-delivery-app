package com.utkarsh.food_delivery_app.repository;

import com.utkarsh.food_delivery_app.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {
    List<Address> findByUserId(Long userId);
}
