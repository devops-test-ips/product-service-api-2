package com.devops.product_service_api_2.repo;

import com.devops.product_service_api_2.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
}
