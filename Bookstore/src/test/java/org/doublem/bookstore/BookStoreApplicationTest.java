package org.doublem.bookstore;

import org.doublem.bookstore.domain.Book;
import org.doublem.bookstore.repository.BookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class BookStoreApplicationTest {

    @Autowired
    private BookRepository bookRepository;

    @BeforeEach
    void before() throws Exception {
        bookRepository.deleteAll();
    }

    @Test
    void contextLoads() {
        bookRepository.save(Book.builder().title("title").author("author").build());
        List<Book> bookList = bookRepository.findAll();

        assertThat(bookList.size()).isEqualTo(1);
    }

    @Test
    void contextLoads2() {
        bookRepository.save(Book.builder().title("title2").price("2300$").author("author").build());
        List<Book> bookList = bookRepository.findAll();

        assertThat(bookList.size()).isEqualTo(1);
    }
}