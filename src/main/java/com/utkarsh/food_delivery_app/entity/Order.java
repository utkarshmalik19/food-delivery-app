package com.utkarsh.food_delivery_app.entity;

import com.utkarsh.food_delivery_app.entity.enums.OrderStatus;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String orderNumber;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "delivery_address_id")
    private Address deliveryAddress;
    @OneToMany(mappedBy = "order",cascade = CascadeType.ALL)
    private List<OrderItem> orderItems;
    private BigDecimal totalAmount;
    private OrderStatus status;
    private LocalDateTime placedAt;
    private String specialDeliveryInstructions;
    //Add payment related fields later
}
