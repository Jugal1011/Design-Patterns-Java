package com.design_patterns.strategy_pattern;

public class AESEncryption implements EncryptionStrategy {

    @Override
    public void encrypt() {
        System.out.println("AES Encryption");
    }
}
