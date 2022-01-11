package com.bsale.bsale.services;

import com.bsale.bsale.entity.Category;
import com.bsale.bsale.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

    /*
        Clase de tipo interfaz de Product, que sirve para declarar las funciones que se van a utilizar en el servicio
     */

public interface IProductService {

     /*
        Metodos que se van a utilizar en la implementacion del servicio de productos para listar los productos
        segun una cateogoria
     */

    public Page<Product> listProductByCategory (Long idCategory, Pageable pageable);

     /*
        Metodos que se van a utilizar en la implementacion del servicio de productos para listar todos los productos
     */

    public Page<Product> listProduct (Pageable pageable);

     /*
        Metodos que se van a utilizar en la implementacion del servicio de productos para listar los productos
        segun el nombre ingresado
     */

    public Page<Product> listProductByName (String name,Pageable pageable);

}
