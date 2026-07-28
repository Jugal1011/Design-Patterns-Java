package com.design_patterns.strategy_pattern;

public class EmailNotification extends Notification {

    public EmailNotification(EncryptionStrategy encryptionStrategy, CompressionStrategy compressionStrategy) {
        super(encryptionStrategy, compressionStrategy);
    }

    @Override
    public void send() {
        System.out.println("Sending Email Notification");
    }
}
