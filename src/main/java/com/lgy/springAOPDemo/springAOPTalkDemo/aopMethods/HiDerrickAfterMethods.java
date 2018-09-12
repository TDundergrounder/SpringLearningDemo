package com.lgy.springAOPDemo.springAOPTalkDemo.aopMethods;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class HiDerrickAfterMethods implements AfterReturningAdvice {
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("after methods here!!!!!!");
    }
}
