package com.lgy.springAOPDemo.springAOPMathDemo.springAOPSolution.aopAdvices.CustomAdvices;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.Random;

public class TimeSpanAdvice implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        long start = System.currentTimeMillis();
        lazy();
        Object result = methodInvocation.proceed();
        long end = System.currentTimeMillis();
        System.out.println("耗时："+(end-start)+"ms");
        return result;
    }

    public void lazy(){
        try {
            int time = new Random().nextInt(500);
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
