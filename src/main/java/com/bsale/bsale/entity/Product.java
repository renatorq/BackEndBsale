package com.bsale.bsale.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="product")
@Getter
@Setter
public class Product {

    @Id
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="url_image")
    private String urlImage;

    @Column(name="price")
    private double price;

    @Column(name="discount")
    private Long discount;

    @ManyToOne
    @JoinColumn(name = "id")
    @Column(name="category")
    private Category category;

}
