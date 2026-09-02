package com.design_patterns.singleton_pattern.lazy_initialization;

public class Main {

    public static void main(String[] args) {
        // -> Singleton Design Pattern
        // -> Basic & Lazy Initialization
        Calculator c1 = Calculator.getInstance();
        Calculator c2 = Calculator.getInstance();
        System.out.println("Calculator c1 -> " + c1);
        System.out.println("Calculator c2 -> " + c2);
    }
}
