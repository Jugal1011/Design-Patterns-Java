package com.design_patterns.proxy_pattern.protection_proxy;

public class Main {

    public static void main(String[] args) {
        // -> Proxy Design Pattern
        // Protected Proxy
         Database db = new DatabaseProxy("MANAGER");
         db.delete();
    }

}
