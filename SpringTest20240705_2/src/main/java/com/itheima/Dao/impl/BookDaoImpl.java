package com.itheima.Dao.impl;

import com.itheima.Dao.BookDao;
import com.itheima.Service.BookService;

public class BookDaoImpl implements BookDao{

    private BookService bookService;

    public void save(){
        System.out.println("book dao save ...");
        bookService.save();
    }


}
