package com.design_patterns.singleton_pattern.basic;

public class Calculator {

    public int a;
    public int b;

    private static Calculator calculatorObj = new Calculator();

    private Calculator() {
        System.out.println("Creating Calculator Object ...");

    }

    public static Calculator getInstance() {
        return calculatorObj;
    }
}
