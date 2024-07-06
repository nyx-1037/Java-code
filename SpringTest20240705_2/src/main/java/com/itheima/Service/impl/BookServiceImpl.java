package com.itheima.Service.impl;

import com.itheima.Dao.BookDao;
import com.itheima.Dao.impl.BookDaoImpl;
import com.itheima.Service.BookService;

public class BookServiceImpl implements BookService {

    private BookDao bookDao;

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }

    public void setBookDao(BookDaoImpl bookDao) {
        this.bookDao = bookDao;
    }
}
