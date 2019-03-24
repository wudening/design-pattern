package com.learn.designpattern.factory.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {

        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        javaCourseFactory.createNode().edit();
        javaCourseFactory.createVideo().play();

        PythonCourseFactory pythonCourseFactory = new PythonCourseFactory();
        pythonCourseFactory.createNode().edit();
        pythonCourseFactory.createVideo().play();

    }
}
