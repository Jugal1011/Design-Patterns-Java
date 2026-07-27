package com.design_patterns;

// import com.design_patterns.singleton_pattern.basic.Calculator;
// import com.design_patterns.singleton_pattern.lazy_initialization.Calculator;
// import com.design_patterns.singleton_pattern.thread_safety.Calculator;
import com.design_patterns.singleton_pattern.double_checked_lock_mechanism.Calculator;


public class Main {

    public static void main(String[] args) {
        // -> Simple Factory Pattern
        // Notification notification_simple_email = NotificationFactory.createNotification("email");
        // notification_simple_email.sendNotification();
        // Notification notification_simple_sms = NotificationFactory.createNotification("sms");
        // notification_simple_sms.sendNotification();

        // -> Abstract Factory Pattern
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

        // -> Builder Design Pattern
        // UserService userService = new UserService();
        // userService.registerUser("Jugal", 23, "jugal@gmail.com","vadodara");
        // EmailService emailService = new EmailService();
        // emailService.sendWelcomeEmail("Jugal", 23, "jugal@gmail.com");


        // -> Singleton Design Pattern
        // -> Basic & Lazy Initialization
        // Calculator c1 = Calculator.getInstance();
        // Calculator c2 = Calculator.getInstance();
        // System.out.println("Calculator c1 -> " + c1);
        // System.out.println("Calculator c2 -> " + c2);

        // -> Thread Safe & Double Checked Locking Mechanism
        Thread t1 = new Thread(() -> {
            Calculator.getInstance();
        });
        Thread t2 = new Thread(() -> {
            Calculator.getInstance();
        });
        t1.start();
        t2.start();
    }

}
