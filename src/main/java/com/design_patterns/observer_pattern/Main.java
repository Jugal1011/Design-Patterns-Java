package com.design_patterns.observer_pattern;

import com.design_patterns.chain_of_responsibility.*;

public class Main {

    public static void main(String[] args) {
        // -> Observer Design Pattern
         Observer obs1 = new Observer(1,"Jugal");
         Observer obs2 = new Observer(2,"Shakshi");
         Observer obs3 = new Observer(3,"Rajan");
         Observer obs4 = new Observer(4,"Vaishali");
         Subject subject = new Subject();
         subject.addObserver(obs1);
         subject.addObserver(obs2);
         subject.addObserver(obs3);
         subject.addObserver(obs4);
         subject.uploadVideo("Observer DP", "Observer.mp4");
    }

}
