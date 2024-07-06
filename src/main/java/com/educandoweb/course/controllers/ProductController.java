package com.educandoweb.course.controllers;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public ResponseEntity<List<Product>> findAll() {
        List<Product> profuctdList = productService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(profuctdList);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Optional<Product>> findById(@PathVariable Long id) {
        Optional<Product> product = productService.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(product);
    }
}
