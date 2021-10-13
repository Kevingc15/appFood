package com.appfood.appfood.service;

import com.appfood.appfood.model.Restaurant;

import java.util.List;

public interface RestaurantService {

    Restaurant createRestaurant(Restaurant restaurant);

    List<Restaurant> getAllRestaurants();
}
