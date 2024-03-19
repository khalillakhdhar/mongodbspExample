package com.mongod.services;

import com.mongod.documents.Author;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AuthorService {
public Flux<Author> getAllAuthors();
public Mono<Author> getOneAuthor(String id);
public Mono<Author> addOneAuthor(Author author);
public Mono<Void> deleteOneAuthor(String id);
}
