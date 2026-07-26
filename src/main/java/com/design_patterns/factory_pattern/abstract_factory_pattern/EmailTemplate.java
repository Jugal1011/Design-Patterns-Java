package com.design_patterns.factory_pattern.abstract_factory_pattern;

public class EmailTemplate implements Template {

    @Override
    public void formatTemplate() {
        System.out.println("Formatting email template.");
    }

}
