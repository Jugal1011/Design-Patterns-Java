package com.design_patterns.builder_pattern;

public class Main {

    public static void main(String[] args) {
        // -> Builder Design Pattern
         UserService userService = new UserService();
         userService.registerUser("Jugal", 23, "jugal@gmail.com","vadodara");
         EmailService emailService = new EmailService();
         emailService.sendWelcomeEmail("Jugal", 23, "jugal@gmail.com");
    }

}
