package com.demo.repository;
import org.springframework.data.repository.CrudRepository;

import com.demo.model.Books;
public interface BooksRepository extends CrudRepository<Books, Integer>
{
}
