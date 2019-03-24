package com.learn.designpattern.factory.abstractfactory;

public class JavaVideo implements IVideo {

    @Override
    public void play() {
        System.out.println("Java视频正在播放");
    }

}
