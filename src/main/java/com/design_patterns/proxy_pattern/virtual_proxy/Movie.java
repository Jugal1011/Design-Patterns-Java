package com.design_patterns.proxy_pattern.virtual_proxy;

public class Movie implements Video {

    private String fileName;

    public Movie(String fileName) throws InterruptedException {
        this.fileName = fileName;
        loadMovie();
    }

    private void loadMovie() throws InterruptedException {
        System.out.println("Loading movie from the server....");
        Thread.sleep(4000);
    }

    @Override
    public void play() {
        System.out.println("Movie playing: " + fileName);

    }

}
