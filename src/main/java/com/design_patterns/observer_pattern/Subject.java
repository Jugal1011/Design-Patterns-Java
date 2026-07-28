package com.design_patterns.observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public List<Observer> getObserverList() {
        return observerList;
    }

    public void notifyObservers(String title, String fileName) {
        for (Observer observer : observerList) {
            observer.update(title, fileName);
        }
    }

    public void uploadVideo(String title, String fileName) {
        System.out.println("Video Uploaded From Subject | Title: "+title+" | File Name: "+fileName);
        notifyObservers(title, fileName);
    }
}
