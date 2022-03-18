package com.biologix.api.authors.service;

import com.biologix.api.authors.model.Author;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorService extends JpaRepository<Author, Long> {

}
