package com.book_api.book_api.service;

import com.book_api.book_api.model.Book;
import com.book_api.book_api.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Get all books
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    // Add book
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }
    // Delete book
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
