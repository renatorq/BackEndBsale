package com.bsale.bsale.controllers;

import com.bsale.bsale.entity.Category;
import com.bsale.bsale.services.CategoryServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
    Clase que especifica los diferentes endpoint de categoria que se pueden consumir
 */

@RestController
/*end point raiz de categoria*/
@RequestMapping(value = "/category/v1")
public class CategoryController {

    @Autowired
    private CategoryServiceImp categoryServiceImp;

    /*
    Metodo que ejecuta al llamar al endpoint "/list", que devuelve una lista de categorias
     */

    @CrossOrigin(origins = "*",methods = {RequestMethod.GET})
    @GetMapping("/list")
    public ResponseEntity<List<Category>> listCategory () {
        return ResponseEntity.ok(categoryServiceImp.listCategory());
    }

}
