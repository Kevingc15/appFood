package com.appfood.appfood.service;

import com.appfood.appfood.accessdatamysql.RestaurantRepository;
import com.appfood.appfood.model.Restaurant;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RequiredArgsConstructor
@Service
public class RestaurantServiceImpl implements RestaurantService {


    /**
     * Restaurant repository
     */
    private final RestaurantRepository restaurantRepository;

    @Override
    public Restaurant createRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    @Override
    public List<Restaurant> getAllRestaurants() {
        final Iterable<Restaurant> allRestaurantIt = restaurantRepository.findAll();
        return StreamSupport.stream(allRestaurantIt.spliterator(), false)
                .collect(Collectors.toList());
    }
}
