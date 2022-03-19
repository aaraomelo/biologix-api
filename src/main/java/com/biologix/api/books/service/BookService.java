package com.biologix.api.books.service;

import com.biologix.api.books.model.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookService extends JpaRepository<Book, Long> {

}
