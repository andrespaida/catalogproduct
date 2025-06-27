package com.toyshop.catalog.catalogproduct.domain.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "products")
public class Product {

    @Id
    private String id;

    private String name;
    private String description;
    private double price;
    private int stock;

    @Field("image_url")
    private String imageUrl;

    @Field("created_at")
    private String createdAt;
}