package com.lgy.springAOPDemo.springAOPMathDemo.springAOPSolution.utils;

import com.lgy.springAOPDemo.springAOPMathDemo.springAOPSolution.aopAdvices.CustomAdvices.TimeSpanAdvice;
import org.springframework.aop.framework.ProxyFactory;

public class ProxyFactoryTool {
    public static Object getProxy(Object object){
        ProxyFactory factory = new ProxyFactory(object);
        factory.addAdvice(new TimeSpanAdvice());
        return factory.getProxy();
    }
}
