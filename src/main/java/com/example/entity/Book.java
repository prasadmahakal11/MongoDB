package com.example.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Book {
	
	@Id
	private String id;
	
	@NonNull
	private Integer bookId;
	@NonNull
	private String bookName;
	@NonNull
	private String author;
	@NonNull
	private Double price;
	
	

}
