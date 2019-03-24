package com.learn.designpattern.factory.factorymethod;

import com.learn.designpattern.factory.simplefactory.ICourse;

public class FactoryMethodTest {

    public static void main(String[] args) {

        ICourseFactory factory = new PythonCourseFactory();
        ICourse pythonCourse = factory.create();
        pythonCourse.record();

        factory = new JavaCourseFactory();
        ICourse javaCourse = factory.create();
        javaCourse.record();

    }

}
