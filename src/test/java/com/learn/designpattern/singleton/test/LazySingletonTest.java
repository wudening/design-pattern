package com.learn.designpattern.singleton.test;

public class LazySingletonTest {

    public static void main(String[] args) {
        //LazySimpleSingleton lazySimpleSingleton = LazySimpleSingleton.getInstance();
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("Execute end");

    }
}
