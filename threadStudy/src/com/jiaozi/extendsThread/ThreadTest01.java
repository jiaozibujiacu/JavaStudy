package com.jiaozi.extendsThread;

public class ThreadTest01 {
    // main方法
    public static void main(String[] args) {
            Thread myThread01 = new MyThread();
            Thread myThread02 = new MyThread();
            myThread01.run();
            myThread02.run();
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(this.getName());
    }
}
