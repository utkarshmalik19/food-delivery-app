package com.utkarsh.food_delivery_app.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "restaurants")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String address;
    private String cuisineType;
    private double rating;
    private Boolean isOpen;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private User owner;
    @OneToMany(mappedBy = "restaurant",cascade = CascadeType.ALL)
    private List<MenuItem> menuItems;
}
