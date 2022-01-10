package com.bsale.bsale.services;

import com.bsale.bsale.entity.Category;
import com.bsale.bsale.entity.Product;

import com.bsale.bsale.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProductServiceImp implements IProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Page<Product> listProductByCategory(Long idCategory, Pageable pageable) {
        Category category = new Category();
        category.setId(idCategory);
        return productRepository.findByCategory(category,pageable);
    }

    @Override
    public Page<Product> listProduct(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public Page<Product> listProductByName(String name, Pageable pageable) {
        return productRepository.findByNameContains(name,pageable);
    }
}
