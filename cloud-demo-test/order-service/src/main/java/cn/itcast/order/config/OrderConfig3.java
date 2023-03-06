package cn.itcast.order.config;

import cn.itcast.order.bean.AwayBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * @Value的使用
 * @see cn.itcast.order.pojo.Person
 * 使用@PropertySource读取外部配置文件中的K/v保存到运行环境变量中
 * <p>
 * <p>
 * Aware的使用
 * 自定义组件想要使用Spring容器底层的一些组件(ApplicationContext,BeanFactory,....)
 * 自定义组件实现xxxAware,在创建对象的的时候会实现相关组件中的方法
 * Aware:把Spring底层的一下组件注入到自定义的bean中
 * xxxAware :功能使用XXXProcessor 实现
 * 例:ApplicationContextAware ==> ApplicationContextAwareProcess
 * @see cn.itcast.order.bean.AwayBean
 */

/**
 * Aware的使用
 * 自定义组件想要使用Spring容器底层的一些组件(ApplicationContext,BeanFactory,....)
 * 自定义组件实现xxxAware,在创建对象的的时候会实现相关组件中的方法
 *Aware:把Spring底层的一下组件注入到自定义的bean中
 * xxxAware :功能使用XXXProcessor 实现
 * 例:ApplicationContextAware ==> ApplicationContextAwareProcess
 * @see cn.itcast.order.bean.AwayBean
 */

/**
 * @Profile 指定组件在哪个环境的情况下才能被注册到Spring的容器中,不指定,任何环境下都能注册到这个组件
 * 1.加了环境标识的bean, 只有这个环境被激活的时候,这个bean才能注册到容器中,默认是default环境
 * 2.可以加在类上
 */
//@Configuration
@PropertySource(value = {"classpath:/person.yml"})
public class OrderConfig3 {
@Profile("test")//设置测试环境激活这个bean
    @Bean
    public void test() {
        System.out.println("测试环境");
    }
    @Profile("dev")//设置开发环境激活这个bean
    @Bean
    public void dev() {
        System.out.println("开发环境");
    }
    @Profile("prod")//设置生产环境激活这个bean
    @Bean
    public void prod() {
        System.out.println("正式环境");
    }
}
