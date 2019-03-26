package com.learn.designpattern.singleton.test;

import com.learn.designpattern.singleton.lazy.LazyDoubleCheckSingleton;

/**
 * 不用线程池，用两个线程演示全过程
 */
public class ExectorThread implements Runnable {
    @Override
    public void run() {
        LazyDoubleCheckSingleton singleton = LazyDoubleCheckSingleton.getInstance();
        //LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
