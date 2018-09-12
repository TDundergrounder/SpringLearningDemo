package com.lgy.springAOPDemo.springAOPMathDemo.springAOPSolution.apps;

import com.lgy.springAOPDemo.springAOPMathDemo.springAOPSolution.Dao.IMessage;
import com.lgy.springAOPDemo.springAOPMathDemo.springAOPSolution.Dao.Message;
import com.lgy.springAOPDemo.springAOPMathDemo.springAOPSolution.aopAdvices.CustomAdvices.TimeSpanAdvice;
import com.lgy.springAOPDemo.springAOPMathDemo.springAOPSolution.aopAdvices.BasicAdvices.HiDerrickAfterAdvice;
import com.lgy.springAOPDemo.springAOPMathDemo.springAOPSolution.aopAdvices.BasicAdvices.HiDerrickBeforeAdvice;
import com.lgy.springAOPDemo.springAOPMathDemo.springAOPSolution.aopAdvices.BasicAdvices.HiDerrickSurroundAdvice;
import com.lgy.springAOPDemo.springAOPMathDemo.springAOPSolution.Dao.IMath;
import com.lgy.springAOPDemo.springAOPMathDemo.springAOPSolution.Dao.Math;
import org.springframework.aop.framework.ProxyFactory;
import org.testng.annotations.Test;

public class ProxyFactoryTest {

    @Test
    public void ProfactoryMathTest(){
        //实例化Spring代理工厂
//        ProxyFactory factory = new ProxyFactory();
        ProxyFactory factory = new ProxyFactory(new Math());
        //设置工厂代理类，即被代理的对象
//        factory.setTarget(new Math());
        //添加通知，横切逻辑
        factory.addAdvice(new HiDerrickBeforeAdvice());
        factory.addAdvice(new HiDerrickAfterAdvice());
        factory.addAdvice(new HiDerrickSurroundAdvice());
        factory.addAdvice(new TimeSpanAdvice());

        //从代理工厂获得代理对象
        IMath math = (IMath)factory.getProxy();
        int a= 100,b=50;
        math.add(a,b);
        math.sub(a,b);
        math.mul(a,b);
        math.div(a,b);
    }

    @Test
    public void ProfactoryMessageTest(){
        ProxyFactory factory = new ProxyFactory();
        factory.setTarget(new Message());
        factory.addAdvice(new HiDerrickBeforeAdvice());
        factory.addAdvice(new HiDerrickAfterAdvice());
        factory.addAdvice(new HiDerrickSurroundAdvice());
        factory.addAdvice(new TimeSpanAdvice());
        IMessage message = (IMessage) factory.getProxy();
        message.picMessge();
        message.soundMessage();
    }
}
