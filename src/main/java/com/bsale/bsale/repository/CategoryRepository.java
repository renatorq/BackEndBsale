package com.bsale.bsale.repository;

import com.bsale.bsale.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
    Esta clase se encarga de realizar las consultas a la base de datos de la entidad category
 */

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

    /*
        Este metodo sirve para obtener una lista con toda la categorias
     */

    List<Category> findAll();

}
