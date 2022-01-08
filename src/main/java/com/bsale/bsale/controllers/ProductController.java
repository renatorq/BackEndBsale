package com.bsale.bsale.controllers;
import com.bsale.bsale.entity.Product;
import com.bsale.bsale.services.ProductServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    ProductServiceImp productServiceImp;

    @GetMapping("/listAll")
    public ResponseEntity<Page<Product>> listCategory (@RequestParam Pageable pageable) {
        return ResponseEntity.status(HttpStatus.OK).body(productServiceImp.listProduct(pageable));
    }
}
