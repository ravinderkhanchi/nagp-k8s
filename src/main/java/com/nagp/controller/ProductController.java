package com.nagp.controller;

import com.nagp.entity.Product;
import com.nagp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping
    public Product addOrder(@RequestBody Product product){
        return service.addProduct(product);
    }

    @GetMapping
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id){
        return service.getProductById(id);
    }
}
