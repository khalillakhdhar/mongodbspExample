package com.mongod.services;

import org.springframework.stereotype.Service;

import com.mongod.documents.Book;
import com.mongod.repos.BookRepository;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
@RequiredArgsConstructor
public class BookServiceImplement implements BookService {

	private final BookRepository bookRepository;
	
	@Override
	public Flux<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	public Mono<Book> getOneBook(String id) {
		// TODO Auto-generated method stub
		return bookRepository.findById(id);
	}

	@Override
	public Mono<Book> addOneBook(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.save(book);
	}

	@Override
	public Mono<Void> deleteOneBook(String id) {
		// TODO Auto-generated method stub
		return bookRepository.deleteById(id);
	}

}
