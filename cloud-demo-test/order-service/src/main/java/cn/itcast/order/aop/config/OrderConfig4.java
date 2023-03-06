package cn.itcast.order.aop.config;

import cn.itcast.order.aop.service.BookService;
import cn.itcast.order.aop.service.impl.BookServiceImpl;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
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
 *      @see cn.itcast.order.aop.notice.Notice
 *      切面----绑定通知和切入点
 *
 *切入点表达式
 * execution( void cn.itcast.order.aop.service.BookService.save())
 *  void cn.itcast.order.aop.service.BookService.*(*)返回值为空，这个包下的任意方法，带一个参数的
 *  void cn.itcast.order.aop.service.BookService.s*(..)返回值为空，这个包下的s开头的方法，参数任意
 *
 *
 */

/**
 * 通知类型：
 * 前置通知 --@Before()
 * 后置通知 --@After()
 * 环绕通知 -- @Around()
 *          环绕通知是在方法的前后调用切入点，会将原始方法去除，如果想保留需要在切入点调用原始方法
 * 返回后通知 --@AfterReturning()
 * 抛出异常后通知 --@AfterThrowing()
 */

/**
 *AOP原理  （看给容器中注册了什么组件，这个组件什么时候工作，这个组件的功能是什么）
 *  1.
 *  @EnableAspectJAutoProxy
 * @EnableAspectJAutoProxy是什么：
 *      @Import({AspectJAutoProxyRegistrar.class}) 给容器中导入了AspectJAutoProxyRegistrar
 *          利用AspectJAutoProxyRegistrar自定义给容器中注册bean
 *               给容器中注册了一个
 *  @see             org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator
 *
 *  2、AnnotationAwareAspectJAutoProxyCreator继承了多个类最终
 *  implements SmartInstantiationAwareBeanPostProcessor, BeanFactoryAware
 *                    后置处理器(在bean初始化前后做的事情)      注入一个BeanFactory
 *
 *
 * 流程：
 * 1.传入配置类，创建IOC容器
 * 2.注册配置类，调用refresh（）方法刷新容器
 * 3.registerBeanPostProcessors(ConfigurableListableBeanFactory beanFactory);注册bean的后置处理器来方便拦截bean的创建
 *          1）先获取IOC容器已经定义了的需要创建对象的所有BeanPostProcessors
 *          2）给容器中加别的BeanPostProcessors
 *          3）优先注册实现PriorityOrdered接口的BeanPostProcessors
 *          4）再注册实现Ordered接口的BeanPostProcessors
 *          5）注册没实现优先级接口的BeanPostProcessors
 *          6）注册BeanPostProcessors ，实际上就是创建BeanPostProcessors对象，保存在容器中
 *             创建internalAutoProxyCreator（名称）的BeanPostProcessors【AnnotationAwareAspectJAutoProxyCreator】（类型）
 *                  1、创建bean实例
 *                  2、populateBean 给bean的各种属性赋值
 *                  3.initializeBean 初始化bean
 *                          1.invokeAwareMethods  处理aware接口的回调
 *                          2.applyBeanPostProcessorsBeforeInitialization  应用后置处理器的PostProcessorsBeforeInitialization
 *                          3.invokeInitMethods  执行初始化方法
 *                          4.applyBeanPostProcessorsBeforeInitialization  执行后置处理器的PostProcessorsBeforeInitialization
 *                  4.BeanPostProcessors创建成功
 *            7）把BeanPostProcessors注册到beanFactory 中
 */
@Configuration
@ComponentScan(value = "cn.itcast.order.aop")
@EnableAspectJAutoProxy//告诉Spring这里面有用注解开发的AOP
public class OrderConfig4 {

}
