package com.appfood.appfood.controller;

import com.appfood.appfood.accessdatamysql.RestaurantRepository;
import com.appfood.appfood.model.Restaurant;
import com.appfood.appfood.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

//Recibe contexto (direccion)
@Controller
@RequestMapping("restaurant")
@RequiredArgsConstructor
@RestController
public class RestaurantController {


    private final RestaurantService restaurantService;

    /**
     * Create a restaurant
     *
     * @param request Object with all restaurant information
     * @return Created restaurant
     */
    @PostMapping("")
    public ResponseEntity<Restaurant> createRestaurant(@RequestBody final Restaurant request) {


        return ResponseEntity.ok(restaurantService.createRestaurant(request));
    }

    /**
     * Get restaurants
     *
     * @return all Restaurants
     */
    @GetMapping(path = "/list")
    public @ResponseBody
    Iterable<Restaurant> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
    }


}
