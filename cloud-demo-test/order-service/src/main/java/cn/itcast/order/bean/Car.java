package cn.itcast.order.bean;

import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;


public class Car {
    public void carBorn(){
        System.out.println("car出生");
    }
    public void init(){
        System.out.println("car__init");
    }
    public void distroy(){
        System.out.println("'car__distroy'");
    }
}
