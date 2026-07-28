package com.design_patterns.proxy_pattern.virtual_proxy;

public class MovieProxy implements Video {

    private String fileName;
    Video video;

    public MovieProxy(String fileName) {
        System.out.println("Proxy Object Created");
        this.fileName = fileName;
    }

    @Override
    public void play() throws InterruptedException {
        if (video == null) {
            video = new Movie(fileName);
        }
        video.play();
    }
}
