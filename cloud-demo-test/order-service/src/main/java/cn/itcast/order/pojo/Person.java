package cn.itcast.order.pojo;

import org.springframework.beans.factory.annotation.Value;

public class Person {
    @Value("张三")
    private String name;
    @Value("#{20-2}")//@Value("18")
    private Integer age;
    @Value("${}")//可以取配置文件的值
    private String nickName;
}
