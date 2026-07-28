package com.design_patterns.observer_pattern;

public class Observer {

    private final String name;
    private final int id;

    public Observer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void update(String title, String fileName) {
        System.out.println("Video Notification To Observer | ID: "+this.id+" | Name: "+this.name+" | Title : "+title+" | File Name: "+fileName);
    }

}
