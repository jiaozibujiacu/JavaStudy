package com.jiao.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @Description: lambda用法
 * @Author: xiam
 * @Create: 2019-07-15
 **/
public class lambdaUsage {

    public static List<Apple> filter(List<Apple> appleList, Predicate<Apple> predicateAppler){
        List<Apple> result = new ArrayList<>();
        for (Apple apple:appleList){
            if(predicateAppler.test(apple)){
                result.add(apple);
            }
        }
        return  result;
    }
    public static void main(String[] args) {
        List<Apple> appleList = Arrays.asList(new Apple(120, "yellow"), new Apple(150, "green"));
        List<Apple> yellowApple = filter(appleList, (apple -> apple.getColor().equals("yellow")));
        System.out.println(yellowApple);
    }
}
