package com.learn.designpattern.factory.simplefactory;

public class JavaCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("Java课程录制中");
    }
}
