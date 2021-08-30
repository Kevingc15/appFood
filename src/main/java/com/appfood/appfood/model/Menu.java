package com.appfood.appfood.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.util.List;

@Builder
@Getter
public class Menu {

    @Singular("products")
    private List<Product> products;
}
