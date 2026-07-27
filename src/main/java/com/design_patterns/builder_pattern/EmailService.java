package com.design_patterns.builder_pattern;

public class EmailService {

    public void sendWelcomeEmail(String name, int age, String email) {
        User user = new User.UserBuilder()
                .setName(name)
                .setAge(age)
                .setEmail(email)
                .build();

        System.out.println("Welcome Email Sent To -> " + user);
    }
}
