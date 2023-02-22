package cn.itcast;

import cn.itcast.order.config.OrderConfig2;
import cn.itcast.order.config.factory.OrderFactory;
import cn.itcast.order.pojo.Order;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDemo {
    @Test
    public void test1() throws Exception {
        Order order = new Order();
        OrderFactory orderFactory = new OrderFactory();
        Order object = orderFactory.getObject();
        System.out.println(object);
    }

    @Test
    public void beanStart() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(OrderConfig2.class);
        System.out.println("容器创建完成");
        //关闭容器
        context.close();
    }
}
