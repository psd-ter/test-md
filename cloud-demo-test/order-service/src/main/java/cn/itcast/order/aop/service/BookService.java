package cn.itcast.order.aop.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

public interface BookService {
    void save();
    void update();
}
