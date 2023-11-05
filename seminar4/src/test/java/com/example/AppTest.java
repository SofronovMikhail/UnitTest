package com.example;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {
    @Test
    public void TestBookService1() {
        Book book = new Book("1", "aaa", "bbb");
        BookRepository mockBookRepository = mock(BookRepository.class);
        when(mockBookRepository.findById("1")).thenReturn(book);
        BookService bookService = new BookService(mockBookRepository);
        assertThat(bookService.findBookById("1")).isEqualTo(book);
    }

    @Test
    public void TestBookService2() {
        InMemoryBookRepository inMemoryBookRepository = new InMemoryBookRepository();
        BookRepository mockBookRepository = mock(BookRepository.class);
        when(mockBookRepository.findAll()).thenReturn(inMemoryBookRepository.findAll());
        BookService bookService = new BookService(mockBookRepository);
        assertThat(bookService.findAllBooks()).isEqualTo(inMemoryBookRepository.findAll());
    }

}