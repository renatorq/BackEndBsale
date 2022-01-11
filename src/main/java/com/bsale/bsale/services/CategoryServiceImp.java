package com.bsale.bsale.services;

import com.bsale.bsale.entity.Category;
import com.bsale.bsale.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/*
    Clase que se utiliza para facilitar los servicios al controlador
 */

@Service
@Transactional
public class CategoryServiceImp implements ICategoryService{

    @Autowired
    private CategoryRepository categoryRepository;

    /*
        Este metodo utiliza el findAll del Repository,devuelve lista de categorias
     */

    @Override
    public List<Category> listCategory() {
        return categoryRepository.findAll();
    }
}
