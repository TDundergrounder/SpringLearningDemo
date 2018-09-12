package com.lgy.springAOPDemo.springAOPCustServiceDemo.apps;

import com.lgy.springAOPDemo.springAOPCustServiceDemo.custService.CustService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testCustServiceApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring-aop-custService-config.xml"});
        CustService custService = (CustService) context.getBean("custService");
        custService.printName();
        custService.printUrl();
        System.out.println("==================" + "\n");
        try {
            custService.printThrowException();
        } catch (Exception e) {

        }

        //BeforeProxy
        CustService custService01 = (CustService) context.getBean("custServiceBeforeProxy");
        custService01.printName();
        System.out.println("-------------------");
        custService01.printUrl();
        try {
            custService01.printThrowException();
        } catch (Exception e) {

        }

        //AfterProxy
        CustService custService02 = (CustService) context.getBean("custServiceAfterProxy");
        custService02.printName();
        System.out.println("-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-");
        custService02.printUrl();
        try {
            custService02.printThrowException();
        } catch (Exception e) {

        }

        //ThrowProxy
        CustService custService03 = (CustService) context.getBean("custServiceThrowsProxy");
        custService03.printName();
        System.out.println("-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-");
        custService03.printUrl();
        try {
            custService03.printThrowException();
        } catch (Exception e) {

        }

        //AroundProxy
        CustService custService04 = (CustService)context.getBean("custServiceAroundProxy");

    }
}
