package com.appfood.appfood.controller;

import com.appfood.appfood.model.Order;
import com.appfood.appfood.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("order")
@RequiredArgsConstructor
@RestController
public class OrderController {

    private final OrderService orderService;

    /**
     * Create a order
     *
     * @param request Object with all order information
     * @return Created order
     */
    @PostMapping("")
    public ResponseEntity<Order> createOrder(@RequestBody final Order request) {

        return ResponseEntity.ok(orderService.createOrder(request));
    }

    /**
     * Get orders
     *
     * @return all orders
     */
    @GetMapping(path = "/list")
    public @ResponseBody
    Iterable<Order> getAllOrders() {
        return orderService.getAllOrders();
    }
}
