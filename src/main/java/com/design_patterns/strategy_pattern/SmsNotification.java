package com.design_patterns.strategy_pattern;

public class SmsNotification extends Notification {

    public SmsNotification(EncryptionStrategy encryptionStrategy, CompressionStrategy compressionStrategy) {
        super(encryptionStrategy, compressionStrategy);
    }

    @Override
    public void send() {
        System.out.println("Sending SMS Notification");
    }
}
