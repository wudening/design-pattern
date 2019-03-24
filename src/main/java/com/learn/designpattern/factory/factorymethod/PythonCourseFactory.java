package com.learn.designpattern.factory.factorymethod;

import com.learn.designpattern.factory.simplefactory.ICourse;
import com.learn.designpattern.factory.simplefactory.PythonCourse;

public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
