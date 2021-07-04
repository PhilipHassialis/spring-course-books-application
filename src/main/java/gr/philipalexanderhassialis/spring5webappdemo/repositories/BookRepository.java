package gr.philipalexanderhassialis.spring5webappdemo.repositories;

import org.springframework.data.repository.CrudRepository;

import gr.philipalexanderhassialis.spring5webappdemo.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
