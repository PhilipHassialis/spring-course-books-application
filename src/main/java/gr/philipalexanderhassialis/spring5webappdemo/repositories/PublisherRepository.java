package gr.philipalexanderhassialis.spring5webappdemo.repositories;

import org.springframework.data.repository.CrudRepository;

import gr.philipalexanderhassialis.spring5webappdemo.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
