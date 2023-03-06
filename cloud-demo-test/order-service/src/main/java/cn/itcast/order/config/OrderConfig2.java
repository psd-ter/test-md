package cn.itcast.order.config;

import cn.itcast.order.bean.Car;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 给容器中注册组件bean
 * 1、包扫描+组件标注主键  如：@service、@Repository
 * 2、@Bean
 * 3、@Import  可以将一个类直接导入到ioc容器中注册为一个bean.这个类可以是第三方的
 * 1）、@Import（要导入到容器中的组件）；容器中就会自动注册这个组件
 * 2）、@ImportSelector：写一个类实现ImportSelector接口，返回需要的如组件的全类名数组
 * 3）、@ImportBeanDefinitionRegistrar：写一个接口实现ImportBeanDefinitionRegistrar，手动注册bean到容器中
 * 4、使用Spring提供的FactoryBean
 * 1）、默认获取到的是工厂bean调用的getObeject创建的对象
 * 2）、要获取工程bean本身，我们需要给id前面加一个&
 */

/**
 * bean的生命周期 :bean从初始化到销毁的过程
 * 1、自定义bean的生命周期
 *        可以在（bean后面）指定对象的初始化方法和结束方法
 *         初始化时间：
 *               在对象创建完成，并赋值完成
 *          销毁时间：
 *                单实例：在容器关闭的时候
 *                多实例：容器不会管理这个bean 容器不会调用销毁方法
 *  2、通过让bean实现(类 implements ) InitializingBean
 *                  DisposableBean
 * 3.可以使用JSR250：@PostConstruct  Z在bean创建完成并且属性赋值完成，来执行初始化方法
 *                  @PreDestroy      在容器销毁bean之前通知我们进行清理
 * @see cn.itcast.order.bean.Red
 *
 * 4.实现接口BeanPostProcessor   ---bean的后置处理器。在每个bean的初始化之前和创建之后执行其中的方法
 * postProcessBeforeInitialization 在初始化之前
 * postProcessAfterInitialization  在初始化之后
 * @see cn.itcast.order.bean.MyBeanPostProcessor
 */
//@Configuration
//@Import(OrderService.class)
public class OrderConfig2 implements InitializingBean, DisposableBean {
//    @Bean(initMethod = "init",destroyMethod = "distroy")
    @Bean(initMethod = "init",destroyMethod = "distroy")
    public Car beanLife() {
        return new Car();
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("bean__销毁");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("bean__初始化");
    }
}
