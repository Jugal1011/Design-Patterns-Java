package com.design_patterns.strategy_pattern;

import com.design_patterns.chain_of_responsibility.*;

public class Main {
    public static void main(String[] args) {
        // -> Strategy Design Pattern
        Notification email = new EmailNotification(new AESEncryption(), new ZIPCompression());
        email.encrypt();
        email.compress();
        email.send();
        Notification sms = new SmsNotification(new AESEncryption(), new GZIPCompression());
        sms.encrypt();
        sms.compress();
        sms.send();
        Notification push = new PushNotification(new RSAEncryption(), new ZIPCompression());
        push.encrypt();
        push.compress();
        push.send();
    }
}
