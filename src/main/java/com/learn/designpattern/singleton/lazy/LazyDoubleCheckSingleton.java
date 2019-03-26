package com.learn.designpattern.singleton.lazy;

public class LazyDoubleCheckSingleton {

    //volatile防止指令重排序
    private static volatile LazyDoubleCheckSingleton lazy = null;

    private LazyDoubleCheckSingleton() {

    }

    /**
     * 适中方案
     *
     * @return
     */
    public static LazyDoubleCheckSingleton getInstance() {
        if (lazy == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                //添加了双重检查锁
                if (lazy == null) {
                    lazy = new LazyDoubleCheckSingleton();
                    //存在问题：CPU执行时会转化成JVM指令执行
                    //指令重排序的问题
                    //1.分配内存给这个对象
                    //2.初始化对象
                    //3.将初始化好的对象和内存地址建立关联，赋值
                    //4.用户初次访问
                    //加volitile
                }
            }
        }
        return lazy;
    }

}
