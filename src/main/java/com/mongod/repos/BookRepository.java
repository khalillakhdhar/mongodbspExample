package com.mongod.repos;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.mongod.documents.Book;

public interface BookRepository extends ReactiveMongoRepository<Book, String> {

}
