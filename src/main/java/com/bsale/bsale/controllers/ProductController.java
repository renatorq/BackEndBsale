package com.bsale.bsale.controllers;
import com.bsale.bsale.entity.Product;
import com.bsale.bsale.services.ProductServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/*
    Clase que especifica los diferentes endpoint de producto que se pueden consumir
 */

@RestController
/*end point raiz de producto*/
@RequestMapping(value = "/product/v1")
public class ProductController {

    @Autowired
    ProductServiceImp productServiceImp;

    /*
        Metodo que ejecuta el end point "/listAll", que devuelve una lista paginada de todos los productos
     */

    @CrossOrigin(origins = "*",methods = {RequestMethod.GET})
    @GetMapping("/listAll")
    public ResponseEntity<Page<Product>> listProduct (@RequestParam int page, int size ) {

        Pageable sortedByName =  PageRequest.of(page, size, Sort.by("name"));

        return ResponseEntity.status(HttpStatus.OK).body(productServiceImp.listProduct(sortedByName));
    }

     /*
        Metodo que ejecuta el end point "/listByCategory\idCategory", que devuelve una lista paginada de todos los productos
        segun el "idCategory" ingresado, idCategory se refiere al codigo de la categoria tipo Long
     */

    @CrossOrigin(origins = "*",methods = {RequestMethod.GET})
    @GetMapping(value = "/listByCategory/{idCategory}")
    public ResponseEntity<Page<Product>> listProductByCategory (@PathVariable Long idCategory, @RequestParam int page, int size ){
        Pageable sortedByName = PageRequest.of(page, size, Sort.by("name"));
        return ResponseEntity.status(HttpStatus.OK).body(productServiceImp.listProductByCategory(idCategory, sortedByName));
    }

     /*
        Metodo que ejecuta el end point "/listByName", que devuelve una lista paginada de todos los productos
        segun el nombre ingresado
     */

    @CrossOrigin(origins = "*",methods = {RequestMethod.GET})
    @GetMapping("/listByName")

    public ResponseEntity<Page<Product>> listProductByName(@RequestParam String name,int page, int size){
        Pageable sortedByName =PageRequest.of(page, size, Sort.by("name"));
        return ResponseEntity.status(HttpStatus.OK).body(productServiceImp.listProductByName(name,sortedByName));
    }

}
