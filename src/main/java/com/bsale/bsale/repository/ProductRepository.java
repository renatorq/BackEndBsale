package com.bsale.bsale.repository;

import com.bsale.bsale.entity.Category;
import com.bsale.bsale.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product,Long> {

    public Page<Product> findByCategory(Category category, Pageable pageable);

    public Page<Product> findAll( Pageable pageable);

    public Page<Product> findByNameContains(String name, Pageable pageable);

}
