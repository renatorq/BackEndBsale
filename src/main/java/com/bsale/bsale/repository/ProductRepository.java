package com.bsale.bsale.repository;

import com.bsale.bsale.entity.Category;
import com.bsale.bsale.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
    Esta clase se encarga de realizar las consultas a la base de datos de la entidad product
 */

@Repository

public interface ProductRepository extends JpaRepository<Product,Long> {

    /*
        Metodo para listar los productos que pertenecen a una categoria y con paginado
     */
    public Page<Product> findByCategory(Category category, Pageable pageable);

     /*
        Metodo para obtener toda la lista de los productos y con paginacion
     */

    public Page<Product> findAll( Pageable pageable);

     /*
        Metodo para listar los productos segun el nombre ingresado y con paginacion
     */

    public Page<Product> findByNameContains(String name, Pageable pageable);

}
