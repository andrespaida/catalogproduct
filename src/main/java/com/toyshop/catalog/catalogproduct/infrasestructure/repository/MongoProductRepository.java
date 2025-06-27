package com.toyshop.catalog.catalogproduct.infrasestructure.repository;

import com.toyshop.catalog.catalogproduct.domain.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoProductRepository extends MongoRepository<Product, String> {
}
