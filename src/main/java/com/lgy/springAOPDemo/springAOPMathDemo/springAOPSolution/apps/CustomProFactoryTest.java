package com.lgy.springAOPDemo.springAOPMathDemo.springAOPSolution.apps;

import com.lgy.springAOPDemo.springAOPMathDemo.springAOPSolution.Dao.IMath;
import com.lgy.springAOPDemo.springAOPMathDemo.springAOPSolution.Dao.IMessage;
import com.lgy.springAOPDemo.springAOPMathDemo.springAOPSolution.Dao.Math;
import com.lgy.springAOPDemo.springAOPMathDemo.springAOPSolution.Dao.Message;
import com.lgy.springAOPDemo.springAOPMathDemo.springAOPSolution.utils.ProxyFactoryTool;
import org.testng.annotations.Test;

public class CustomProFactoryTest {
    @Test
    public void testMathCuproxy(){
        IMath math = (IMath) ProxyFactoryTool.getProxy(new Math());
        int a=4000,b=160;
        math.add(a,b);
        math.sub(a,b);
        math.mul(a,b);
        math.div(a,b);
    }

    @Test
    public void testMessageCuproxy(){
        IMessage iMessage = (IMessage) ProxyFactoryTool.getProxy(new Message());
        iMessage.soundMessage();
        iMessage.picMessge();
    }
}
