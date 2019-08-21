package com.trycode.springcrud.controller;

import com.trycode.springcrud.entity.Product;
import com.trycode.springcrud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping("")
    public Iterable<Product> all() {
        return productRepository.findAll();
    }
}
