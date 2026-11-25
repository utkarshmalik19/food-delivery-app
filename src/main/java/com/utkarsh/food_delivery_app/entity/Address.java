package com.utkarsh.food_delivery_app.entity;

import com.utkarsh.food_delivery_app.entity.enums.AddressType;
import jakarta.persistence.*;

@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "user_id")
    private User user;
    private String addressLine;
    private String city;
    private String state;
    private String pincode;
    private AddressType addressType;
}
