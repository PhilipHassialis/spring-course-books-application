package gr.philipalexanderhassialis.spring5webappdemo.repositories;

import org.springframework.data.repository.CrudRepository;

import gr.philipalexanderhassialis.spring5webappdemo.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
