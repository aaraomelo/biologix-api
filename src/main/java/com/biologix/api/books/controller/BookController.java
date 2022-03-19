package com.biologix.api.books.controller;

import java.util.List;

import com.biologix.api.books.model.Book;
import com.biologix.api.books.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController{
  @Autowired
  private BookService bookService;

  @GetMapping
  public List<Book> findAll() {
    return bookService.findAll();
  }

  @PostMapping
  public void save(@RequestBody Book author) {
    bookService.save(author);
  }

  @PutMapping
  public void update(@RequestBody Book author) {
    if (author.getId() > 0)
      bookService.save(author);
  }

  @DeleteMapping
  public void delete(@RequestBody Book author) {
    bookService.delete(author);
  }

}
