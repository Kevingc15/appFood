package com.appfood.appfood.service;

import com.appfood.appfood.model.Product;

import java.util.List;

public interface ProductService {

    Product createProduct(Product product);
    List<Product> getAllProducts();
}
