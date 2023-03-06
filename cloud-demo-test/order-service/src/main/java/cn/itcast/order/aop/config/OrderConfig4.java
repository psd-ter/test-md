package cn.itcast.order.aop.config;

import cn.itcast.order.aop.service.impl.BookServiceImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author: 皮三冬
 * @date: 2023/2/28 20:28
 */

/**
 *AOP：面向切面编程 ==在不惊动原始代码的情况下进行增强
 *      连接点---每一个方法
 *      切入点---要追加功能的方法
 *      @see BookServiceImpl
 *      通知-----共性功能也就是要插入到连接点的方法
 *      通知类---存放通知的方法
 *      切面----绑定通知和切入点
 *
 *
 *
 */
@Configuration
@Component(value = "cn.itcast.order.aop")
public class OrderConfig4 {

}
