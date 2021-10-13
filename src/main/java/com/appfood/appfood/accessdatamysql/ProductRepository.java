package com.appfood.appfood.accessdatamysql;

import com.appfood.appfood.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
