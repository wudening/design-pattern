package com.learn.designpattern.factory.abstractfactory;

public class PythonVideo implements IVideo {

    @Override
    public void play() {
        System.out.println("python视频正在播放");
    }

}
