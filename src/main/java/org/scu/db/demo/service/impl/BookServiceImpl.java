package org.scu.db.demo.service.impl;

import org.scu.db.demo.mapper.BookMapper;
import org.scu.db.demo.model.Book;
import org.scu.db.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    public List<Book> findAllBooks()
    {
        return bookMapper.queryBook();
    }

    public List<Map> query_call_and_count(){
        return bookMapper.query_call_and_count();
    }

    @Override
    public List<Integer> findAllBorrowedBooksId() {
        return bookMapper.query_all_borrowed_booksid();
    }

    @Override
    public Integer countCall123Book() {
        return bookMapper.query_count_Call123_book();
    }

    @Override
    public List<String> findCountNotExceed2Callnumber() {
        return bookMapper.query_count_not_exceed_2_callnumber();
    }
}
