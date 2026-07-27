package com.design_patterns.singleton_pattern.lazy_initialization;

public class Calculator {

    public int a;
    public int b;

    private static Calculator calculatorObj;

    private Calculator() {
        System.out.println("Creating Calculator Object ...");
    }

    public static Calculator getInstance() {
        if (calculatorObj == null) {
            calculatorObj = new Calculator();
        }
        return calculatorObj;
    }
}
