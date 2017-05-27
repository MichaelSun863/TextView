package com.example.hasee.runtextview.bean;

/**
 * Created by hasee on 2017/5/26.
 */

public class DemoBean {

    public String name;
    public Class<?> aClass;

    public DemoBean(String name,Class<?> aClass){
        this.name = name;
        this.aClass = aClass;
    }

    @Override
    public String toString(){
        return name;
    }
}
