package com.lgy.springAnnotationDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("zs")
@Scope("prototype")
public class ZooSecond {

    public ZooSecond() {

    }

    public static ZooSecond getInstance(){
        return new ZooSecond();
    }

    @Autowired
    public ZooSecond(Tiger tiger) {
        this.tiger = tiger;
    }

    private Tiger tiger;

    @Autowired
    @Qualifier("lion")
    private Animals animals;


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        ZooSecond z = (ZooSecond) context.getBean("zs");
        ZooSecond zooSecond = ZooSecond.getInstance();
        System.out.println(z.tiger.getMouthSize());
    }
}
