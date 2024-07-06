package com.itheima;

import com.itheima.Dao.BookDao;
import com.itheima.Service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        //获取IoC
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取bean
//        BookDao bookDao = (BookDao)ctx.getBean("bookDao");
//        bookDao.save();

        BookService bookService = (BookService)ctx.getBean("bookService");
        bookService.save();

    }
}
