package cn.itcast.order.aop.service.impl;

import cn.itcast.order.aop.service.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Override
    public void save() {
        System.out.println("BookService ---- save方法调用");
    }

    @Override
    public void update() {
        System.out.println("BookService ---- update方法调用");

    }
}
