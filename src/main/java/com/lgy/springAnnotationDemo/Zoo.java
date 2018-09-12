package com.lgy.springAnnotationDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Zoo {
    @Autowired
    private Lion lion;

    @Autowired
    private  Tiger tiger;

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Zoo z = (Zoo)context.getBean("zoo");
        System.out.println(z.tiger.getEyeColor());
    }
}
