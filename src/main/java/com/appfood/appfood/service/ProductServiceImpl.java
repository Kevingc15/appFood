package com.appfood.appfood.service;

import com.appfood.appfood.accessdatamysql.ProductRepository;
import com.appfood.appfood.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService{

    /**
     * Product repository
     */
    private final ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        final Iterable<Product> allProductIt = productRepository.findAll();
        return StreamSupport.stream(allProductIt.spliterator(), false).collect(Collectors.toList());
    }
}
