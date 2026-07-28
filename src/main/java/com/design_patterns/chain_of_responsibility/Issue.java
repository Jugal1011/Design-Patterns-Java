package com.design_patterns.chain_of_responsibility;

public class Issue {
    private int priority;
    private String status;

    public Issue(int priority, String status) {
        this.priority = priority;
        this.status = status;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
