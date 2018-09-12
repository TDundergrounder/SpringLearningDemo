package com.lgy.springAOPDemo.springAOPTalkDemo.aopMethods;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.Arrays;

public class HiDerrickAroundMethods implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("method name is:" + methodInvocation.getMethod().toString());
        System.out.println("method args is:" + Arrays.toString(methodInvocation.getArguments()));

        System.out.println("before around methods here!!!");

        try {
            Object result = methodInvocation.proceed();

            System.out.println("after around methods here!!!");
            return result;
        } catch (IllegalArgumentException e) {
            System.out.println("throw exception here!!!");
            throw e;
        }
    }
}
