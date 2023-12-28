package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.entity.Book;

public interface BookRepository extends MongoRepository<Book,String> {
	
	public Book findByBookId(Integer bookid);

}
