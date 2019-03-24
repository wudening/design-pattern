package com.learn.designpattern.factory.simplefactory;

/**
 * 工厂模型
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {

        ICourse course = new JavaCourse();
        course.record();

        ICourse javaCourse = CourseFactory.create("java");
        javaCourse.record();

        ICourse course2 = CourseFactory.create2(JavaCourse.class);
        course2.record();

        ICourse course3 = CourseFactory.create3("com.learn.designpattern.factory.simplefactory.JavaCourse");
        course3.record();

    }

}
