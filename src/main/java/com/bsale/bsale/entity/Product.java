package com.bsale.bsale.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

    /*
    Clase de tipo entidad Product, que sirve para la interaccion con la tabla product de la Base de Datos
     */

@Entity
@Table(name="product")
@Getter
@Setter
public class Product {

    /*
        atributo id de product,es el codigo del producto
     */

    @Id
    @Column(name="id")
    private Long id;

    /*
        atributo name de product, es el nombre del producto
     */

    @Column(name="name")
    private String name;

    /*
        atributo url_image de product, es la direccion url de la imagen del producto
     */

    @Column(name="url_image")
    private String urlImage;

    /*
        atributo price de product, es el precio del producto
     */

    @Column(name="price")
    private double price;

    /*
        atributo discount de product, es el descuento del producto
     */

    @Column(name="discount")
    private Long discount;

    /*
        atributo category de product, es el id categoria el cual pertenece un producto
     */

    @ManyToOne
    @JoinColumn(name = "category")
    private Category category;

}
