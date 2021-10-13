package com.appfood.appfood.service;

import com.appfood.appfood.accessdatamysql.OrderRepository;
import com.appfood.appfood.model.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RequiredArgsConstructor
@Service
public class OrderServiceImpl implements OrderService{

    /**
     * Oder repository
     */
    private final OrderRepository orderRepository;

    @Override
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getAllOrders() {
        final Iterable<Order> allOrderIt = orderRepository.findAll();
        return StreamSupport.stream(allOrderIt.spliterator(), false).collect(Collectors.toList());
    }
}
