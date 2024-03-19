package com.mongod.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongod.documents.Book;
import com.mongod.services.BookService;
import com.mongod.services.BookService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("books")
@RequiredArgsConstructor
public class BookController {
	private final BookService bookService;
	@GetMapping
	public Flux<Book> getAll()
	{
		return bookService.getAllBooks();
	}
	@GetMapping("/{id}")
	public Mono<Book> getOne(@PathVariable String id)
	{
		return bookService.getOneBook(id);
	}
	@PostMapping
	public Mono<Book> addOne(@RequestBody  Book book)
	{
		return bookService.addOneBook(book);
	}
	@DeleteMapping("/{id}")
	public Mono<Void> deleteOne(@PathVariable String id)
	{
		return bookService.deleteOneBook(id);
	}
	



}
