package com.appfood.appfood.model;

import lombok.*;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.List;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "menu")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", updatable = false)
    private  Integer id;

    @Singular("products")
    @OneToMany(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "menu")
    private List<Product> products;

    @OneToOne
    private Restaurant restaurant;
}
