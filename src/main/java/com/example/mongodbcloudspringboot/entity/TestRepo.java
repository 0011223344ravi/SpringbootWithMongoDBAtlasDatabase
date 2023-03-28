package com.example.mongodbcloudspringboot.entity;

import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TestRepo extends MongoRepository<Test,Integer> {

}
