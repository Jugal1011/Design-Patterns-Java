package com.design_patterns;

import com.design_patterns.builder_pattern.EmailService;
import com.design_patterns.builder_pattern.UserService;


public class Main {
    public  static void main(String[] args) {
        // Simple Factory Pattern
        // Notification notification_simple_email = NotificationFactory.createNotification("email");
        // notification_simple_email.sendNotification();
        // Notification notification_simple_sms = NotificationFactory.createNotification("sms");
        // notification_simple_sms.sendNotification();

        // Abstract Factory Pattern
        // Factory emailFactory = new EmailFactory();
        
        // Template emailTemplate = emailFactory.createTemplate();
        // emailTemplate.formatTemplate();
        // Notification emailNotification = emailFactory.createNotification();
        // emailNotification.sendNotification();

        // Factory smsFactory = new SmsFactory();
        // Template smsTemplate = smsFactory.createTemplate();
        // smsTemplate.formatTemplate();
        // Notification smsNotification = smsFactory.createNotification();
        // smsNotification.sendNotification();

        // Builder Design Pattern
        UserService userService = new UserService();
        userService.registerUser("Jugal", 23, "jugal@gmail.com","vadodara");
        EmailService emailService = new EmailService();
        emailService.sendWelcomeEmail("Jugal", 23, "jugal@gmail.com");
    }
    
}
