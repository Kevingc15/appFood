package com.appfood.appfood.controller;

import com.appfood.appfood.model.Product;
import com.appfood.appfood.model.Restaurant;
import com.appfood.appfood.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("product")
@RequiredArgsConstructor
@RestController
public class ProductController {

    private final ProductService productService;

    /**
     * Create a product
     *
     * @param request Object with all product information
     * @return Created product
     */

    @PostMapping("")
    public ResponseEntity<Product> createRestaurant(@RequestBody final Product request){
        return ResponseEntity.ok(productService.createProduct(request));
    }

    @GetMapping(path = "/list")
    public @ResponseBody
    Iterable<Product> getAllProducts(){return productService.getAllProducts();}

}
