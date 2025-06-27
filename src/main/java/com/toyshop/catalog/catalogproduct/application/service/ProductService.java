package com.toyshop.catalog.catalogproduct.application.service;

import com.toyshop.catalog.catalogproduct.domain.model.Product;
import com.toyshop.catalog.catalogproduct.domain.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public Product addProduct(Product product) {
        return repo.save(product);
    }

    public List<Product> listProducts() {
        return repo.findAll();
    }
}
