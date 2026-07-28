package com.design_patterns.strategy_pattern;

public class PushNotification extends Notification{

    public PushNotification(EncryptionStrategy encryptionStrategy, CompressionStrategy compressionStrategy) {
        super(encryptionStrategy, compressionStrategy);
    }

    @Override
    public void send() {
        System.out.println("Sending Push Notification");
    }

}
