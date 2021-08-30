package com.appfood.appfood.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Builder
@Getter
@Setter
public class Product {

    private final String name;

    private final String description;

    private final BigDecimal price;

    private final String category;
}
