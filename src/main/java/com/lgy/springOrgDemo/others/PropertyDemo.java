package com.lgy.springOrgDemo.others;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class PropertyDemo {
    private String[] arrs = new String[5];
    private List<Integer> integerList;
    private Map<String,String> map = new HashMap<String, String>();
    private Properties properties;

    public String[] getArrs() {
        return arrs;
    }

    public void setArrs(String[] arrs) {
        this.arrs = arrs;
    }

    public List<Integer> getList() {
        return integerList;
    }

    public void setList(List<Integer> list) {
        this.integerList = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
