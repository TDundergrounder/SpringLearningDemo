package com.lgy.testServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class ClassB {

    @Autowired
    private ClassA a;

    @PostConstruct
    public void init(){
        initB();
    }

    public void initB(){
        System.out.println("init B");
    }

    public ClassB() {
        System.out.println("B construct");
    }
}
