package com.learn.designpattern.singleton.lazy;

public class LazySimpleSingleton {

    private static LazySimpleSingleton lazy = null;

    private LazySimpleSingleton() {

    }

    /**
     * 加synchronized再调试
     * JDK1.6后对synchronized优化了
     * 不可避免还是存在一些性能问题
     * static 加在方法上，synchronized会锁整个类
     *
     * @return
     */
    public static synchronized LazySimpleSingleton getInstance() {
        if (lazy == null) {
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }
}
