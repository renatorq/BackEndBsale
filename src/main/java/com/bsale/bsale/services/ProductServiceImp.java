package com.bsale.bsale.services;

import com.bsale.bsale.entity.Category;
import com.bsale.bsale.entity.Product;

import com.bsale.bsale.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
/*
 * Esta clase se utiliza para facilitar servicios al controlador
 */
@Service
@Transactional
public class ProductServiceImp implements IProductService{

    @Autowired
    private ProductRepository productRepository;

    /*
    Este metodo utiliza el metodo findByCategory del repository,
    se ingresa un long como id de categoria para obtener una lista de productos segun la categoria enviada
     */

    @Override
    public Page<Product> listProductByCategory(Long idCategory, Pageable pageable) {
        Category category = new Category();
        category.setId(idCategory);
        return productRepository.findByCategory(category,pageable);
    }

    /*
    Este metodo utiliza el metodo findAll del repository,
    sirve para obtener una lista de todos los productos
     */

    @Override
    public Page<Product> listProduct(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    /*
    Este metodo utiliza el metodo listProductByName del repository,
    se envia una cadena de caracteres como nombre y este devuelve una lista de productos que coincida con el nombre ingresado
     */

    @Override
    public Page<Product> listProductByName(String name, Pageable pageable) {
        return productRepository.findByNameContains(name,pageable);
    }
}
