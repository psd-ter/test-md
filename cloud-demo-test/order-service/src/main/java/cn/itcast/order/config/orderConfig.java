package cn.itcast.order.config;

import cn.itcast.order.config.condition.Mycondition;
import cn.itcast.order.pojo.Order;
import cn.itcast.order.service.OrderService;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

//@Configuration 告诉spring这是一个配置类

/**
 * @ComponentScan 包扫描用、只要标注了@Controller、@Service、@Repository、@Component。中的任意一个，且在定义的包下
 *  就会被扫描到并注册为一个bean
 * excludeFilters 指定扫描的时候按照什么规则排除哪些组件
 * includeFilters 指定扫描的时候包含哪些组件，但是想要其生效必须(useDefaultFilters = false),因为ComponentScan默认扫描全部
 *     过滤规则 ANNOTATION         按照注解
 *             ASSIGNABLE_TYPE    按照给定类型
 *             ASPECTJ            使用ASPECTJ表达式
 *             REGEX              使用正则指定
 *             CUSTOM              使用自定义规则
 */

//@Bean 给容器中注册一个bean；类型为返值得类型 ；id默认使用方法名为ID;value可以重命名bean在容器中的名字
    //单例bean是在spring启动的时候注册到IOC容器中。多例bean是在调用该bean时才会注册到IOC容器中

/**
 * @Scope() 配置bean为单实例还是多实例
 *      prototype  多实例的：IOC容器启动不会立马创建对象放到容器中，掉用该方法的时候才会被注册为一个bean
 *      singleton   单实例的：IOC容器启动会调用方法创建对象放到IOC容器中，以后每次获取就是直接从容器中拿
 */
//@lazy  懒加载。sring容器创建的时候不加载，在获取的时候才会加载，但是只加载一次。只有单例bean能使用
//@Conditional  按照一定的条件加载，只有满足条件的时候才会把类或者方法加载为一个bean

// @Import  可以将一个类直接导入到ioc容器中注册为一个bean.这个类可以是第三方的

@Import(OrderService.class)
@Configuration
@ComponentScan(value = "cn.itcast", excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class)//按照类型排除
},
        includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class),//指定扫描的时候只需要包含哪些组件
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = OrderService.class)//按照给定类型。
        },useDefaultFilters = false
)
class orderConfig {
    @Bean(value = "newName")
    @Scope("singleton")
    @Lazy
    @Conditional(Mycondition.class)
    public Order orderTest() {
        return new Order();
    }


}
