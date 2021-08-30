package com.appfood.appfood.model;

import lombok.*;

import java.util.List;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Restaurant {

    /**
     * Restaurant name.
     */
    private String name;

    /**
     * Restaurant Address.
     */
    private String address;

    /**
     * Restaurant tables.
     *
     * @Singular es de lombok y hace referencia a
     * una lista y recibe como parametro el nombre.
     */
    @Singular("tables")
    private List<Table> tables;

    /**
     * Restaurant menu.
     */
    private Menu menu;
}
