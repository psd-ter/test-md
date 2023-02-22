package cn.itcast.order.config.factory;

import cn.itcast.order.pojo.Order;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class OrderFactory implements FactoryBean<Order> {
    @Override
    public Order getObject() throws Exception {
        return new Order();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
    @Override
    public boolean isSingleton(){
        return true;
    }
}
