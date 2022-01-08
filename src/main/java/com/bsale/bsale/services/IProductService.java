package com.bsale.bsale.services;

import com.bsale.bsale.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface IProductService {

    public Page<Product> listProductByCategory (Long category, Pageable pageable);

    public Page<Product> listProduct (Pageable pageable);

    public Page<Product> listProductByName (String name,Pageable pageable);

}
