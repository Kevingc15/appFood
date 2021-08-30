package com.appfood.appfood.controller;

import com.appfood.appfood.model.Restaurant;
import com.appfood.appfood.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Objects;

//Recibe contexto (direccion)
@Controller
@RequestMapping("restaurant")
@RequiredArgsConstructor
public class RestaurantController {


    private final RestaurantService restaurantService;

    /**
     * Create a restaurant
     *
     * @param request Object with all restaurant information
     * @return Created restaurant
     */
    @PostMapping("/")
    public ResponseEntity<Restaurant> createRestaurant(@RequestBody final Restaurant request) {

       return ResponseEntity.ok(restaurantService.createRestaurant(request));
    }
}
