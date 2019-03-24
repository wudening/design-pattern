package com.learn.designpattern.factory.abstractfactory;

public class JavaCourseFactory implements CourseFactory {

    @Override
    public INode createNode() {
        return new JavaNode();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}
