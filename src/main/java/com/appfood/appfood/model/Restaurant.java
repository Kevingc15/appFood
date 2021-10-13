package com.appfood.appfood.model;

import lombok.*;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.List;


@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity
@Table(name = "restaurant")
public class Restaurant {

    /**
     * Restaurant  id.
     */
    @Id
    @SequenceGenerator(
            name = "restaurant_sequence",
            sequenceName = "restaurant_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "restaurant_sequence")
    @Column(name = "id", updatable = false)
    private int id;


    /**
     * Restaurant name.
     */
    @Column(name = "name")
    private String name;

    /**
     * Restaurant Address.
     */
    @Column(name = "address")
    private String address;

    @Column(name = "image")
    private String image;

    /**
     * Restaurant tables.
     *
     * @Singular es de lombok , hace referencia a
     * una lista y recibe como parametro el nombre.
     */
    @Singular("tables")
    @OneToMany(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "restaurant")
    private List<RestaurantTable> restaurantTables;

    /**
     * Restaurant menu.
     */
    @OneToOne
    private Menu menu;


}
