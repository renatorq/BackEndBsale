package com.bsale.bsale.controllers;

import com.bsale.bsale.entity.Category;
import com.bsale.bsale.services.CategoryServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/category")
public class CategoryController {

    @Autowired
    private CategoryServiceImp categoryServiceImp;

    @CrossOrigin(origins = "*",methods = {RequestMethod.GET})
    @GetMapping("/list")
    public ResponseEntity<List<Category>> listCategory () {
        return ResponseEntity.ok(categoryServiceImp.listCategory());
    }

}
