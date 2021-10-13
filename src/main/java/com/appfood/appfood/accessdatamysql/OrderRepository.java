package com.appfood.appfood.accessdatamysql;

import com.appfood.appfood.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Integer> {
}
