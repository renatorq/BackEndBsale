package com.bsale.bsale.controllers;

import com.bsale.bsale.entity.Category;
import com.bsale.bsale.services.CategoryServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/category")
public class CategoryController {

    @Autowired
    private CategoryServiceImp categoryServiceImp;

    @GetMapping("/list")
    public ResponseEntity<List<Category>> listCategory () {
        return ResponseEntity.ok(categoryServiceImp.listCategory());
    }

}
