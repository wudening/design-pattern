package com.learn.designpattern.factory.abstractfactory;

public class PythonCourseFactory implements CourseFactory {

    @Override
    public INode createNode() {
        return new PythonNode();
    }

    @Override
    public IVideo createVideo() {
        return new PythonVideo();
    }

}
