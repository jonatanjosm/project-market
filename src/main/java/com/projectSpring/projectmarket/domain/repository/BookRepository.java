package com.projectSpring.projectmarket.domain.repository;

import com.projectSpring.projectmarket.domain.Book;

public interface BookRepository {
    Book getByIsbn(String isbn);
}
