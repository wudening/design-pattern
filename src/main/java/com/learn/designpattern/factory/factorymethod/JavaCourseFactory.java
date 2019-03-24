package com.learn.designpattern.factory.factorymethod;

import com.learn.designpattern.factory.simplefactory.ICourse;
import com.learn.designpattern.factory.simplefactory.JavaCourse;

public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
