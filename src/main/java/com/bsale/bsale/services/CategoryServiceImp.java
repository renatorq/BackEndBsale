package com.bsale.bsale.services;

import com.bsale.bsale.entity.Category;
import com.bsale.bsale.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CategoryServiceImp implements ICategoryService{

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> listCategory() {
        return categoryRepository.findAll();
    }
}
