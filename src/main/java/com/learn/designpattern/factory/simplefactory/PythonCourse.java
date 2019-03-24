package com.learn.designpattern.factory.simplefactory;

public class PythonCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("Python课程录制中");
    }
}
