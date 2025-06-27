package com.toyshop.catalog.catalogproduct.domain.repository;

import com.toyshop.catalog.catalogproduct.domain.model.Product;
import java.util.List;

public interface ProductRepository {
    Product save(Product product);
    List<Product> findAll();
}