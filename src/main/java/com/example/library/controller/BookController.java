package com.example.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.model.Book;
import com.example.library.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookService service;

    //Add new book
    @PostMapping("/addbook")
    public Object addBook(@RequestBody Book book){
       return service.addBook( book);
    }

    //get all books
    @GetMapping("/getallbooks")
     public List<Book> getAllBooks() {
        return service.getAllBooks();
    }

      // get book by id
    @GetMapping("getbook/{id}")
    public Object getBookById(@PathVariable Integer id) {
        return service.getBookById(id);

    }

    

     // delete book data
    @DeleteMapping("/deletebook/{id}")
    public boolean deleteBook(@PathVariable Integer id) {
        return service.deleteBook(id);
    }

     @PutMapping("/{id}/availability")
    public Book updateAvailability(@PathVariable int id, @RequestParam boolean available) {
        return service.updateAvailability(id, available);
    }
    
    

}
