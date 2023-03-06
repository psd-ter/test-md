package cn.itcast.order.aop;

import cn.itcast.order.aop.config.OrderConfig4;
import cn.itcast.order.aop.service.BookService;
import cn.itcast.order.aop.service.impl.BookServiceImpl;
import cn.itcast.order.bean.Red;
import cn.itcast.order.config.orderConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;

public class TestAop {

@Test
    public void test(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(OrderConfig4.class);
    BookService bean = applicationContext.getBean(BookService.class);
//    String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//    for (String beanDefinitionName : beanDefinitionNames) {
//        System.out.println(beanDefinitionName);
//    }
    bean.save();
bean.update();

    }
}
