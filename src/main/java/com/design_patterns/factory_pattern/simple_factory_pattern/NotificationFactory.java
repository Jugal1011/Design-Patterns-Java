package com.design_patterns.factory_pattern.simple_factory_pattern;

import java.util.ArrayList;
import java.util.List;

public class NotificationFactory {

    public static Notification createNotification(String notificationType) {
        switch (notificationType) {
            case "email":
                return new EmailNotification();
            case "sms":
                return new SmsNotification();
            default:
                throw new IllegalArgumentException("Unknown notification type");
        }
    }

    public static List<Notification> createNotifications(List<String> notificationTypes) {
        List<Notification> notifications = new ArrayList<>();
        for (String type : notificationTypes) {
            notifications.add(createNotification(type));
        }   
        return notifications;
    }

}
