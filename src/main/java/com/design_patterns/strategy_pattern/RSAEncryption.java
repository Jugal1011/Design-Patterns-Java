package com.design_patterns.strategy_pattern;

public class RSAEncryption implements EncryptionStrategy {

    @Override
    public void encrypt() {
        System.out.println("RSA Encryption");
    }
}
