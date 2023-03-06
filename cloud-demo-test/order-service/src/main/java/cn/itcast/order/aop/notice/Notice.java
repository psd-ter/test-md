package cn.itcast.order.aop.notice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * 共性功能，也叫通知类
 */
@Component
@Aspect//告诉SPring这个是通知类
public class Notice {
    //定义切入点
@Pointcut("execution( void cn.itcast.order.aop.service.BookService.save())")
    public void poinCut(){}
    //定义切入点2
    @Pointcut("execution( void cn.itcast.order.aop.service.BookService.update())")
    public void poinCut2(){}
    //通知
    @Before("poinCut()")
    public void common(){
        System.out.println(System.currentTimeMillis());
    }
    @Around("poinCut2()")
    public void around(ProceedingJoinPoint pjd) throws Throwable {
        System.out.println("环绕通知前");
        Object poinCut2 = pjd.proceed();
        System.out.println("环绕通知后");
        //如果原方法有返回值，需要把返回类型改为Object,并return poinCut2；
    }
}
