package com.appfood.appfood.model;



import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;

import javax.persistence.*;


@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity
@Table(name = "restaurant_table")
public class RestaurantTable {

    /**
     * Table number.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", updatable = false)
    private  Integer id;

    /**
     * Table order.
     */
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "orden_id")
    private Order orden;

    /**
     * Table state.
     */
    private  Boolean state;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;
}
