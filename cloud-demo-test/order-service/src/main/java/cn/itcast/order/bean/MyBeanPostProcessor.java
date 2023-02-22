package cn.itcast.order.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
//bean的后置处理器
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    /**
     *
     * @param bean  刚创建的bean，还未初始化
     * @param beanName  bean的名字
     * @return  bean
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization+==>"+beanName+"==>"+bean);

        return bean;
    }

    /**
     *
     * @param bean  刚创建的bean,初始化之后
     * @param beanName  bean的名字
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization==>"+beanName+"==>"+bean);
        return bean;
    }
}
