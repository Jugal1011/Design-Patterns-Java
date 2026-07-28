package com.design_patterns.strategy_pattern;

public abstract class Notification {

    EncryptionStrategy encryptionStrategy;
    CompressionStrategy compressionStrategy;

    public Notification(EncryptionStrategy encryptionStrategy, CompressionStrategy compressionStrategy) {
        this.encryptionStrategy = encryptionStrategy;
        this.compressionStrategy = compressionStrategy;
    }

    public abstract void send();

    public void encrypt() {
        encryptionStrategy.encrypt();
    }

    public void compress() {
        compressionStrategy.compress();
    }
}
