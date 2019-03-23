package com.jiaozi.staticDemo;

/**
 * @Description:
 * @Author: xiam
 * @Create: 2019-03-24
 **/
public class Girl extends Person {
    private  String name;
    static{
        System.out.println("girl的静态方法执行了################");
    }
    {
        System.out.println("girl的构造方法块执行了################");
    }
    public Girl(){
        System.out.println("girl的构造函数执行了");
        this.name= name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
