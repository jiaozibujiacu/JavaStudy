package com.jiaozi.staticDemo;

/**
 * @Description:
 * @Author: xiam
 * @Create: 2019-03-24
 **/
public class Person {
    static {
        System.out.println("person静态方法的执行");
    }

    {
        System.out.println("person构造代码快执行了");
    }

    private static String testName;

    public String name;

    private String age;

    public Person() {
        System.out.println("person构造方法的执行。。。。。");
        this.name = "jiaozi";
        this.age = "12";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
