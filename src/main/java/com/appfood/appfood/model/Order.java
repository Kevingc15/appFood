package com.appfood.appfood.model;

import lombok.*;
import org.springframework.data.annotation.Transient;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Builder
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orden")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", updatable = false)
    private Integer id;

    /**
     * Order products.
     */
    @Singular("products")
    @OneToMany(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "orden")
    private List<Product> products;

    /**
     * Order Time
     */
    @Transient
    private Date time;

    /**
     * Order total price
     */
    private BigDecimal price;

    /**
     *
     */
    @OneToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "orden")
    private RestaurantTable restaurantTable;
}
