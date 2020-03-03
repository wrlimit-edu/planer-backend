package com.wrlimit.planerbackend.repository;

import com.wrlimit.planerbackend.model.Priority;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriorityMongoRepository extends MongoRepository<Priority, Long> {
    Priority findByName(String name);
}
