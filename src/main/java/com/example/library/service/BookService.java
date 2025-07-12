package com.example.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.Repository.BookRepository;
import com.example.library.model.Book;

@Service
public class BookService {

    @Autowired
    BookRepository repo;

    // add book
    public Object addBook(Book book) {
        book.setAvailable(true);
        return repo.save(book);
    }

    // get all books
    public List<Book> getAllBooks() {
        return repo.findAll();
    }

    // get book by id
    public Object getBookById(int id) {
        return repo.findById(id);

    }

    public boolean deleteBook(Integer id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return true;
        }
        return false;
    }

    public Book updateAvailability(int id, boolean available) {
        return repo.findById(id).map(book -> {
            book.setAvailable(available);
            return repo.save(book);
        }).orElseThrow(() -> new RuntimeException("Book not found with id: " + id));
    }

}
