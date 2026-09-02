package com.design_patterns.factory_pattern.abstract_factory_pattern;

public class Main {

    public static void main(String[] args) {
        // -> Abstract Factory Pattern
        Factory emailFactory = new EmailFactory();
        Template emailTemplate = emailFactory.createTemplate();
        emailTemplate.formatTemplate();
        Notification emailNotification = emailFactory.createNotification();
        emailNotification.sendNotification();
        Factory smsFactory = new SmsFactory();
        Template smsTemplate = smsFactory.createTemplate();
        smsTemplate.formatTemplate();
        Notification smsNotification = smsFactory.createNotification();
        smsNotification.sendNotification();
    }
}
