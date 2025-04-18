package com.cospes.WebAPITest.Repository;

import com.cospes.WebAPITest.model.Book;
import com.cospes.WebAPITest.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}