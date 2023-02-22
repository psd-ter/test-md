package cn.itcast.order.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Value的使用
 * @see cn.itcast.order.pojo.Person
 *
 *
 */


//使用@PropertySource读取外部配置文件中的K/v保存到运行环境变量中
@Configuration
@PropertySource(value = {"classpath:/person.yml"})
public class OrderConfig3 {



}
