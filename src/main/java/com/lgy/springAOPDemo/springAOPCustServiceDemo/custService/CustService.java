package com.lgy.springAOPDemo.springAOPCustServiceDemo.custService;

public class CustService {
    private String name;
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printName(){
        System.out.println("name = "+name);
    }

    public void printUrl(){
        System.out.println("url = "+url);
    }

    public void printThrowException(){
        throw new IllegalArgumentException();
    }

    public void say() {
        System.out.println("say hello");
    }
}
