package com.toyshop.catalog.catalogproduct.infrasestructure.repository;

import com.toyshop.catalog.catalogproduct.domain.model.Product;
import com.toyshop.catalog.catalogproduct.domain.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private final MongoProductRepository mongoRepo;

    public ProductRepositoryImpl(MongoProductRepository mongoRepo) {
        this.mongoRepo = mongoRepo;
    }

    @Override
    public Product save(Product product) {
        return mongoRepo.save(product);
    }

    @Override
    public List<Product> findAll() {
        return mongoRepo.findAll();
    }
}
