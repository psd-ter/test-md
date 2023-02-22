package cn.itcast.order.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component
public class Red {
    public Red(){
        System.out.println("red---创建了");
    }
    @PostConstruct
    public void beforeCreateBean(){
        System.out.println("初始化---red");
    }
    @PreDestroy
    public void beforeCloseBean(){
        System.out.println("关闭---red");
    }
}
