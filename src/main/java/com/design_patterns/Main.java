package com.design_patterns;

import com.design_patterns.factory_pattern.abstract_factory_pattern.EmailFactory;
import com.design_patterns.factory_pattern.abstract_factory_pattern.Factory;
import com.design_patterns.factory_pattern.abstract_factory_pattern.Notification;
import com.design_patterns.factory_pattern.abstract_factory_pattern.SmsFactory;
import com.design_patterns.factory_pattern.abstract_factory_pattern.Template;


public class Main {
    public  static void main(String[] args) {
        // Simple Factory Pattern
        // Notification notification_simple_email = NotificationFactory.createNotification("email");
        // notification_simple_email.sendNotification();
        // Notification notification_simple_sms = NotificationFactory.createNotification("sms");
        // notification_simple_sms.sendNotification();

        // Abstract Factory Pattern
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
