package com.bsale.bsale.services;

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
    public Page<Product> listProductByCategory(Long category, Pageable pageable) {
        return null;
    }

    @Override
    public Page<Product> listProduct(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public Page<Product> listProductByName(String name, Pageable pageable) {
        return null;
    }
}
