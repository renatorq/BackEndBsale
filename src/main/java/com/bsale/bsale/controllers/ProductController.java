package com.bsale.bsale.controllers;
import com.bsale.bsale.entity.Category;
import com.bsale.bsale.entity.Product;
import com.bsale.bsale.services.ProductServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    ProductServiceImp productServiceImp;

    @GetMapping("/listAll")
    public ResponseEntity<Page<Product>> listProduct (@PageableDefault(size=10,page=0) Pageable pageable) {
        return ResponseEntity.status(HttpStatus.OK).body(productServiceImp.listProduct(pageable));
    }

    @GetMapping("/listByCategory")
    public ResponseEntity<Page<Product>> listProductByCategory (@RequestBody Category category, @PageableDefault(size=10,page=0) Pageable pageable){
        return ResponseEntity.status(HttpStatus.OK).body(productServiceImp.listProductByCategory(category, pageable));
    }

    @GetMapping("/listByName")
    public ResponseEntity<Page<Product>> listProductByName(@RequestParam String name,@PageableDefault(size=10,page=0) Pageable pageable){
        return ResponseEntity.status(HttpStatus.OK).body(productServiceImp.listProductByName(name,pageable));
    }

}
