package com.biologix.api.authors.controller;

import java.util.List;

import com.biologix.api.authors.model.Author;
import com.biologix.api.authors.service.AuthorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authors")
public class AuthorController{
  @Autowired
  private AuthorService authorService;

  @GetMapping
  public List<Author> findAll() {
    return authorService.findAll();
  }

  @PostMapping
  public void save(@RequestBody Author author) {
    authorService.save(author);
  }

  @PutMapping
  public void update(@RequestBody Author author) {
    if (author.getId() > 0)
      authorService.save(author);
  }

  @DeleteMapping
  public void delete(@RequestBody Author author) {
    authorService.delete(author);
  }

}
