package com.design_patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.design_patterns.prototype_pattern.GameBotCharacters;

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
        // Thread t1 = new Thread(() -> {
        //     Calculator.getInstance();
        // });
        // Thread t2 = new Thread(() -> {
        //     Calculator.getInstance();
        // });
        // t1.start();
        // t2.start();

        // -> Prototype Design Pattern
        long startTime = System.currentTimeMillis();

        GameBotCharacters gbc1 = new GameBotCharacters("Bot1", 100, 0, new ArrayList<>(Arrays.asList("Rifle")));
        GameBotCharacters gbc2 = gbc1.customizedClone();
        gbc2.setName("Bot2");
        GameBotCharacters gbc3 = gbc1.customizedClone();
        gbc3.setName("Bot3");
        GameBotCharacters gbc4 = gbc1.customizedClone();
        gbc4.setName("Bot4");
        GameBotCharacters gbc5 = gbc1.customizedClone();
        gbc5.setName("Bot5");
        List<String> weapons = gbc5.getWeapons();
        weapons.add("Sniper");

        System.out.println(gbc1);
        System.out.println(gbc2);
        System.out.println(gbc3);
        System.out.println(gbc4);
        System.out.println(gbc5);

        long endTime = System.currentTimeMillis();

        System.out.println("Total Time Taken" + (endTime-startTime));
    }

}
