package com.lgy.springAOPDemo.springAOPMathDemo.springAOPSolution.aopAdvices.BasicAdvices;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class HiDerrickAfterAdvice implements AfterReturningAdvice {
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("-----------------后置通知-----------------");
    }
}
