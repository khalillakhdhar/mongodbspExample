package com.mongod.repos;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.mongod.documents.Author;

public interface AuthorRepository extends ReactiveMongoRepository<Author, String> {

}
