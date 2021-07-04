package gr.philipalexanderhassialis.spring5webappdemo.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import gr.philipalexanderhassialis.spring5webappdemo.model.Author;
import gr.philipalexanderhassialis.spring5webappdemo.model.Book;
import gr.philipalexanderhassialis.spring5webappdemo.model.Publisher;
import gr.philipalexanderhassialis.spring5webappdemo.repositories.AuthorRepository;
import gr.philipalexanderhassialis.spring5webappdemo.repositories.BookRepository;
import gr.philipalexanderhassialis.spring5webappdemo.repositories.PublisherRepository;

@Component
public class BootstrapData implements CommandLineRunner {

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository,
            PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    @Override
    public void run(String... args) throws Exception {

        Author philip = new Author("Philip", "Hassialis");
        Book mlatt = new Book("My life and the times", "1234");
        philip.getBooks().add(mlatt);
        mlatt.getAuthors().add(philip);

        authorRepository.save(philip);
        bookRepository.save(mlatt);

        Author nick = new Author("Nick", "Sapios");
        Book nickBook = new Book("How to get ahead", "12345");

        nick.getBooks().add(nickBook);
        nickBook.getAuthors().add(nick);

        authorRepository.save(nick);
        bookRepository.save(nickBook);

        Publisher plantBooks = new Publisher("Plant Books", "Stadiou", "Athens", "Attiki", "12345");

        publisherRepository.save(plantBooks);

        System.out.println("Started in bootstrap");
        System.out.println("Number of books " + bookRepository.count());
        System.out.println("Number of authors " + authorRepository.count());
        System.out.println("Number of publishers " + publisherRepository.count());
    }

}
