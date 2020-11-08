package org.scu_db.demo.service;

import org.scu_db.demo.model.Book;

import java.util.List;

public interface BookService {
    List<Book> findAllBooks();
    Book findBookById(Integer Id);
    List<Book> findBookByIdUseSql(Integer Id);

    List<Integer> findBorrowBook();

    List<String> findCallNumberLessThan2();

    Integer deleteBookById(Integer id);
    Integer updateBook(Book book, Integer method);
    Integer countCall123();
}
