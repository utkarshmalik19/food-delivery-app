package com.utkarsh.food_delivery_app.service;

import com.utkarsh.food_delivery_app.entity.MenuItem;

import java.util.List;

public interface MenuItemService {
    MenuItem addMenuItem(Long restaurantId, MenuItem item);
    MenuItem getMenuItemById(Long id);
    List<MenuItem> getMenu(Long restaurantId, Boolean isAvailable);
    List<MenuItem> getMenuItemByCategory(Long restaurantId, String category);
    MenuItem updateMenuItem(Long id, MenuItem updatedMenuItem);
}
