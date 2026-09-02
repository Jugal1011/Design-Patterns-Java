package com.design_patterns.singleton_pattern.thread_safety;

public class Main {
    public static void main(String[] args) {
        // -> Singleton Design Pattern
        // -> Thread Safe & Double Checked Locking Mechanism
        Thread t1 = new Thread(() -> {
            Calculator.getInstance();
        });
        Thread t2 = new Thread(() -> {
            Calculator.getInstance();
        });
        t1.start();
        t2.start();
    }
}
