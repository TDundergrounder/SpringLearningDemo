package com.lgy.springAOPDemo.springAOPMathDemo.cglibSolution;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Random;

//动态生成一个新的类，使用父类的无参构造方法创建一个指定了特定回调的代理实例
public class DynamicProxy implements MethodInterceptor {

    Object targetObject;

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //被织入的横切内容
        long start = System.currentTimeMillis();
        lazy();
        //调用方法
        Object res = methodProxy.invoke(targetObject,objects);
        //被织入的横切内容
        long end = System.currentTimeMillis();
        System.out.println("cost time  :"+(end-start)+"ms");
        return res;
    }

    public Object getProxyObject(Object object){
        this.targetObject = object;

        //增强器，动态代码生成器
        Enhancer enhancer = new Enhancer();

        //回调方法
        enhancer.setCallback(this);

        //设置生成类的父类类型
        enhancer.setSuperclass(targetObject.getClass());

        //动态生成字节码并返回代理对象
        return enhancer.create();

    }

    public void lazy(){
        int time = new Random().nextInt(500);
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
