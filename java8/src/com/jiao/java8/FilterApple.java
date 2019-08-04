package com.jiao.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description: 苹果过滤
 * @Author: xiam
 * @Create: 2019-07-14
 **/
public class FilterApple {

    public static interface FilterAppleInterface{
        public Boolean filTerApple(Apple apple);
    }

    public static class greenAndWeightAppFilter implements FilterAppleInterface{

        @Override
        public Boolean filTerApple(Apple apple) {
            return apple.getColor().equals("green")&&(apple.getWeight()>150);
        }
    }
    public static List<Apple> filterGreenApple(List<Apple> appleList){
        List<Apple> resultList = new ArrayList<>();
        for(Apple apple:appleList){
            if("green".equals(apple.getColor())){
                resultList.add(apple);
            }
        }
        return resultList;
    }

    public static List<Apple> filterColorApple(List<Apple> appleList,String color){
        List<Apple> resultList = new ArrayList<>();
        for(Apple apple:appleList){
            if(apple.getColor().equals(color)){
                resultList.add(apple);
            }
        }
        return resultList;
    }

    public static List<Apple> filterApple(List<Apple> appleList,FilterAppleInterface filterAppleInterface){
        List<Apple> resultList = new ArrayList<>();
        for(Apple apple:appleList){
           if(filterAppleInterface.filTerApple(apple)) {
               resultList.add(apple);
           }
        }
        return resultList;
    }

    public static void main(String[] args) {
        List<Apple> appleList = Arrays.asList(new Apple(200,"green"),
                new Apple(170,"yellow"),new Apple(180,"red"));
        List<Apple> greenApple = filterGreenApple(appleList);
        System.out.println(greenApple);

        List<Apple> redApple = filterColorApple(appleList,"red");
        System.out.println(redApple);

        List<Apple> resultApple = filterApple(appleList,new greenAndWeightAppFilter());
        System.out.println(resultApple);

        List<Apple> resultApple1 = filterApple(appleList, apple -> apple.getColor().equals("red")&&(apple.getWeight()<190));
        System.out.println(resultApple1);
    }
}
