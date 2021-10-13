package com.appfood.appfood.service;

import com.appfood.appfood.model.Order;

import java.util.List;

public interface OrderService {

    Order createOrder(Order order);
    List<Order> getAllOrders();
}
