package com.jiaozi.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        User u =null;
        User n =null;
        list.add(u);
        list.add(n);
        System.out.println(list.size());

    }
}

class User{
    String name;
    String age;

}
