package com.appfood.appfood.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Table {

    /**
     * Table number.
     */
    private final Integer number;

    /**
     * Table order.
     */
    private final Order order;
}
