package com.lgy.springAOPDemo.springAOPCustServiceDemo.aopMethods;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class HiDerrickBeforeMethods implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("before methods here!!!!!");
    }
}
