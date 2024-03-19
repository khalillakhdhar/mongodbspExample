package com.mongod.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongod.documents.Author;
import com.mongod.services.AuthorService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("author")
public class AuthorController {
	private final AuthorService authorService;
	@GetMapping
	public Flux<Author> getAll()
	{
		return authorService.getAllAuthors();
	}
	@GetMapping("/{id}")
	public Mono<Author> getOne(@PathVariable String id)
	{
		return authorService.getOneAuthor(id);
	}
	@PostMapping
	public Mono<Author> addOne(@RequestBody  Author author)
	{
		return authorService.addOneAuthor(author);
	}
	@DeleteMapping("/{id}")
	public Mono<Void> deleteOne(@PathVariable String id)
	{
		return authorService.deleteOneAuthor(id);
	}
	
}
