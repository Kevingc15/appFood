package com.appfood.appfood.accessdatamysql;

import com.appfood.appfood.model.Restaurant;
import org.springframework.data.repository.CrudRepository;


public interface RestaurantRepository extends CrudRepository<Restaurant, Integer> {
}
