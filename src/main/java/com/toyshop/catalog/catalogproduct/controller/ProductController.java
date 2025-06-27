package com.toyshop.catalog.catalogproduct.controller;

import com.toyshop.catalog.catalogproduct.application.service.ProductService;
import com.toyshop.catalog.catalogproduct.domain.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "http://98.85.86.231") // 🔥 Permitir llamadas desde el frontend
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping
    public Product create(@RequestBody Product product) {
        return service.addProduct(product);
    }

    @GetMapping
    public List<Product> getAll() {
        return service.listProducts();
    }
}