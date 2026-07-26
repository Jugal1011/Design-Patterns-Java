package com.design_patterns.factory_pattern.abstract_factory_pattern;

public class SmsTemplate implements Template {
    
    @Override
    public void formatTemplate() {
        System.out.println("Formatting SMS template...");
    }
    
}
