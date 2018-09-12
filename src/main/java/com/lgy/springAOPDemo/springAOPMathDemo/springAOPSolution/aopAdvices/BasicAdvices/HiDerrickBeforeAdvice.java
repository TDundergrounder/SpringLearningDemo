package com.lgy.springAOPDemo.springAOPMathDemo.springAOPSolution.aopAdvices.BasicAdvices;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class HiDerrickBeforeAdvice implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("-----------------前置通知-----------------");
    }
}
