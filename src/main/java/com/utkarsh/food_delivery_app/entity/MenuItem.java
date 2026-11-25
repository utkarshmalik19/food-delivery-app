package com.utkarsh.food_delivery_app.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "menu_items")
public class MenuItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;
    private String category;
    private BigDecimal price;
    private Boolean isAvailable;
}
