package com.lgy.springAOPDemo.springAOPMathDemo.springAOPSolution.utils;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.framework.ProxyFactory;

public class SpringProxy<T> implements MethodInterceptor {

    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        before();
        Object res = methodInvocation.proceed();
        after(res);
        return res;
    }

    public  T getProxy(Object object){
        ProxyFactory factory = new ProxyFactory(object);
        factory.addAdvice(this);
        return (T) factory.getProxy();
    }

    public void before(){
        System.out.println("-----------------方法调用前-----------------");

    }

    public void after(Object obj){
        System.out.println("-----------------方法调用后:"+"\n"+obj);
    }

}