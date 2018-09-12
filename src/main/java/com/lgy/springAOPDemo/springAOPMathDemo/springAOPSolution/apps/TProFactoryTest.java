package com.lgy.springAOPDemo.springAOPMathDemo.springAOPSolution.apps;

import com.lgy.springAOPDemo.springAOPMathDemo.springAOPSolution.Dao.IMath;
import com.lgy.springAOPDemo.springAOPMathDemo.springAOPSolution.Dao.IMessage;
import com.lgy.springAOPDemo.springAOPMathDemo.springAOPSolution.Dao.Math;
import com.lgy.springAOPDemo.springAOPMathDemo.springAOPSolution.Dao.Message;
import com.lgy.springAOPDemo.springAOPMathDemo.springAOPSolution.utils.SpringProxy;
import org.testng.annotations.Test;

public class TProFactoryTest {
    @Test
    public void testMath(){
        SpringProxy<IMath> springProxy = new SpringProxy<IMath>();
        IMath m = springProxy.getProxy(new Math());
        m.add(1323,5325);
        m.mul(456,9234);
    }

    @Test
    public void testMessage(){
        SpringProxy<IMessage> iMessageSpringProxy = new SpringProxy<IMessage>();
        IMessage iMessage = iMessageSpringProxy.getProxy(new Message());
        iMessage.picMessge();
        iMessage.soundMessage();
    }


}
