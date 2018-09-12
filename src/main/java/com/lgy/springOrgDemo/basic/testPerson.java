package com.lgy.springOrgDemo.basic;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class testPerson {
    public static void main(String[] args) {

        //BeanFactory注入Bean
        Resource resource = new ClassPathResource("spring-config.xml");
        BeanFactory fa = new DefaultListableBeanFactory();
        BeanDefinitionReader bdr = new XmlBeanDefinitionReader((BeanDefinitionRegistry) fa);
        bdr.loadBeanDefinitions(resource);
        Person p = (Person)fa.getBean("person");
        System.out.println(p.getName()+"\n"+"groupName:"+p.getGroup().getGrpName());

        //ApplicationContext注入Bean
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        Person p0 = (Person)applicationContext.getBean("person");
        System.out.println(p0.getAge()+"\n"+"groupId:"+p0.getGroup().getGrpId());
    }
}
