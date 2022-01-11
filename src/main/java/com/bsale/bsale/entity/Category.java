package com.bsale.bsale.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;

    /*
    Clase de tipo entidad Category, que sirve para la interaccion con la tabla category de la Base de Datos
     */

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="category")
public class Category {

    /*
        Atributo id de category, que es el codigo de la categoria
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

      /*
        Atributo name de category, que es el nombre de la categoria
     */

    @Column(name = "name")
    private String name;

}
