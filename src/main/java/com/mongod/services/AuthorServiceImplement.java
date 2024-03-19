package com.mongod.services;

import org.springframework.stereotype.Service;

import com.mongod.documents.Author;
import com.mongod.repos.AuthorRepository;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class AuthorServiceImplement implements AuthorService{
	private final AuthorRepository authorRepository;

	@Override
	public Flux<Author> getAllAuthors() {
		// TODO Auto-generated method stub
		return authorRepository.findAll();
	}

	@Override
	public Mono<Author> getOneAuthor(String id) {
		// TODO Auto-generated method stub
		return authorRepository.findById(id);
	}

	@Override
	public Mono<Author> addOneAuthor(Author author) {
		// TODO Auto-generated method stub
		return authorRepository.save(author);
	}

	@Override
	public Mono<Void> deleteOneAuthor(String id) {
		// TODO Auto-generated method stub
		return authorRepository.deleteById(id);
	}

}
