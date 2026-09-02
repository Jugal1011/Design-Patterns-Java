package com.design_patterns.proxy_pattern.virtual_proxy;

public class Main {

    public static void main(String[] args) {
        // -> Proxy Design Pattern
        // Virtual Proxy
        Video video1 = new MovieProxy("Dhamal.mp4");
        Video video2 = new MovieProxy("Golmaal.mp4");
        Video video3 = new MovieProxy("Welcome.mp4");
        try {
            video1.play();
            video2.play();
            video3.play();
            video1.play();
            video2.play();
            video3.play();
        } catch (InterruptedException ex) {
            System.err.println(ex);
        }
    }
}
