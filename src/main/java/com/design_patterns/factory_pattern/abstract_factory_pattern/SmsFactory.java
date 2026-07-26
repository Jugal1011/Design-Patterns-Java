package com.design_patterns.factory_pattern.abstract_factory_pattern;

public class SmsFactory implements Factory {
    
    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }

    @Override
    public Template createTemplate() {
        return new SmsTemplate();
    }
    
}
