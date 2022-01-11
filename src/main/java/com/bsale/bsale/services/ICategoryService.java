package com.bsale.bsale.services;

import com.bsale.bsale.entity.Category;

import java.util.List;

    /*
        Clase de tipo interfaz de Category, que sirve para declarar las funciones que se van a utilizar en el servicio
     */

public interface ICategoryService {

    /*
        Metodos que se van a utilizar en la implementacion del servicio de cateogoria para listar todas las categorias
     */

    public List<Category> listCategory ();

}
