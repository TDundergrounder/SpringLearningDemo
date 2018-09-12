package com.lgy.springOrgDemo.others;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class testPropertyDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        //取出arrs
        PropertyDemo propertyDemo= (PropertyDemo)context.getBean("propertyDemo");
        for(int i=0;i<5;i++){
            String val = propertyDemo.getArrs()[i];
            System.out.print(val+",");
        }

        //取出list
        PropertyDemo propertyDemo1 = (PropertyDemo)context.getBean("propertyDemo");
        int len = propertyDemo1.getList().size();
        Iterator<Integer> iterator = propertyDemo1.getList().iterator();
        while(iterator.hasNext()) {
            Integer val1 = iterator.next();
            System.out.print(val1+",");
        }

        //取出map
        PropertyDemo propertyDemo2 =  (PropertyDemo)context.getBean("propertyDemo");
        Map<String,String> map = propertyDemo2.getMap();
        for (Map.Entry<String,String> entry:map.entrySet()){
            System.out.println("key="+entry.getKey()+","+"value="+entry.getValue());
        }

        //取出propertie
        PropertyDemo propertyDemo3 = (PropertyDemo)context.getBean("propertyDemo");
        Properties properties = propertyDemo3.getProperties();
        Iterator iterator1 = properties.entrySet().iterator();
        while (iterator1.hasNext()){
            Map.Entry prokeyValue = (Map.Entry)iterator1.next();
//            Object key = prokeyValue.getKey();
//            Object val = prokeyValue.getValue();
            System.out.println("key="+prokeyValue.getKey()+","+"value="+prokeyValue.getValue());

        }
    }
}
