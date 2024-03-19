package com.mongod.services;

import com.mongod.documents.Book;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BookService {
	public Flux<Book> getAllBooks();
	public Mono<Book> getOneBook(String id);
	public Mono<Book> addOneBook(Book book);
	public Mono<Void> deleteOneBook(String id);
}
