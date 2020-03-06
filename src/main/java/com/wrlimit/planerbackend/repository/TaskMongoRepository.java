package com.wrlimit.planerbackend.repository;

import com.wrlimit.planerbackend.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskMongoRepository extends MongoRepository<Task, Integer> {
    Task findByName(String name);
}
