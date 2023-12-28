package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Book;
import com.example.repository.BookRepository;

@RestController
public class BookRestController {

	@Autowired
	private BookRepository repository;

	
	@GetMapping("/show")
	public ResponseEntity<String>show()
	{
		return new ResponseEntity<String>("hii alll",HttpStatus.OK);
	}
	@PostMapping("/add")
	public ResponseEntity<String>addBook(@RequestBody Book book){
		
		repository.insert(book);
		return new ResponseEntity<>("Book Saved",HttpStatus.OK);
		
	}
	
	@GetMapping("/all")
	public List<Book>getAllBook(){
		return repository.findAll();
	}
	
	@GetMapping("/book/{bookId}")
	public Book getBookByBookId(@PathVariable Integer bookId) {
		
		return repository.findByBookId(bookId);
		
	}
	
	@DeleteMapping("/book/{id}")
	public String deletBookByObjectId(@PathVariable String id) {
		
		repository.deleteById(id);
		return "Book Deleted";
		
	}
}
