package com.lgy.testServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class ClassA {

    private static volatile boolean isInit ;

    @Autowired
    private ClassB b;

    public ClassA() {
        System.out.println("A construct");
    }

    @PostConstruct
    public void init(){
        initA();
    }

    public void initA(){
        if(!isInit){
            System.out.println("initA");
        }
        isInit = true;
    }
}

//Constructor >> @Autowired >> @PostConstruct

