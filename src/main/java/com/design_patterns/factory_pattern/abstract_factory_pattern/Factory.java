package com.design_patterns.factory_pattern.abstract_factory_pattern;

public interface Factory {
    Notification createNotification();
    Template createTemplate();
}
