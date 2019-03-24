package com.learn.designpattern.factory.simplefactory;

public class CourseFactory {

    public static ICourse create(String name) {

        if ("java".equals(name)) {
            return new JavaCourse();
        } else if ("python".equals(name)) {
            return new PythonCourse();
        } else {
            return null;
        }
    }

    public static ICourse create2(Class<? extends ICourse> clazz) {

        try {
            if (clazz != null) {
                return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public static ICourse create3(String className) {

        if (null != className && !"".equals(className)) {
            try {
                return (ICourse) Class.forName(className).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
        return null;
    }

}
