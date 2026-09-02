package com.design_patterns.factory_pattern.simple_factory_pattern;

public class Main {

    public static void main(String[] args) {
        // -> Simple Factory Pattern
         Notification notification_simple_email = NotificationFactory.createNotification("email");
         notification_simple_email.sendNotification();
         Notification notification_simple_sms = NotificationFactory.createNotification("sms");
         notification_simple_sms.sendNotification();
    }

}
