package com.design_patterns.decorater_pattern;

public class Main {

    public static void main(String[] args) {
        // -> Decorater Design Pattern
        Coffee coffee = new SimpleCoffee();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        coffee = new WhippedCreamDecorator(coffee);
        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost());
    }
}
