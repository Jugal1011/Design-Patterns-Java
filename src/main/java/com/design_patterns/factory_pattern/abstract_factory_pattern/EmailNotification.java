package com.design_patterns.factory_pattern.abstract_factory_pattern;

public class EmailNotification implements Notification {

    @Override
    public void sendNotification() {
        System.out.println("Sending email notification.");
    }

}