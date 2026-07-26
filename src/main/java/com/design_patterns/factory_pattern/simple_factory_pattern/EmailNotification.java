package com.design_patterns.factory_pattern.simple_factory_pattern;

public class EmailNotification implements Notification {

    @Override
    public void sendNotification() {
        System.out.println("Sending email notification.");
    }

}