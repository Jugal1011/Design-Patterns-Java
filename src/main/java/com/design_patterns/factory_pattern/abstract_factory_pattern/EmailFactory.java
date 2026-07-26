package com.design_patterns.factory_pattern.abstract_factory_pattern;

public class EmailFactory implements Factory {
    
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }

    @Override
    public Template createTemplate() {
        return new EmailTemplate();
    }

}
