package org.ootb.springbootdemo.solr.controller;

import org.ootb.springbootdemo.solr.model.Book;
import org.ootb.springbootdemo.solr.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/")
    public List<Book> getBooksByAuthor(@RequestParam String author){
        return bookRepository.findBooksByAuthorContains(author);
    }

    @GetMapping("/all")
    public List<Book> getAllBooks(){
        List<Book> bookList = new ArrayList<>();
        Iterable<Book> it = bookRepository.findAll();
        for(Book book: it){
            bookList.add(book);
        }

        return bookList;


    }
}
