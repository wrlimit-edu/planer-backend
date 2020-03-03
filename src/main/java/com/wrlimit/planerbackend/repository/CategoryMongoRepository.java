package com.wrlimit.planerbackend.repository;

import com.wrlimit.planerbackend.model.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryMongoRepository extends MongoRepository<Category, Long> {
    Category findByName(String name);
}
