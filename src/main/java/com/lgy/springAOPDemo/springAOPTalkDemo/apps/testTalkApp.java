package com.lgy.springAOPDemo.springAOPTalkDemo.apps;

import com.lgy.springAOPDemo.springAOPTalkDemo.talk.ITalk;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testTalkApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring-aop-Talk-config.xml"});
        ITalk talk = (ITalk) context.getBean("talkProxy");
        talk.say();
    }
}
