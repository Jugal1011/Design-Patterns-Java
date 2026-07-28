package com.design_patterns.proxy_pattern.protection_proxy;

public class MySqlDatabase implements Database {

    @Override
    public void delete() {
        System.out.println("User Deleted");
    }
}
