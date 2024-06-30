package com.educandoweb.course.controllers;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categories")
    public ResponseEntity<List<Category>> findAll() {
        List<Category> categoriesList = categoryService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(categoriesList);
    }

    @GetMapping("/category/{id}")
    public ResponseEntity<Optional<Category>> findById(@PathVariable Long id) {
        Optional<Category> category = categoryService.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(category);
    }
}
