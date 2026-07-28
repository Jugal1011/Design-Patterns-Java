package com.design_patterns.chain_of_responsibility;

public class Client {
    private RequestHandler handler;

    public Client(RequestHandler handler) {
        this.handler = handler;
    }

    public void raiseIssue(Issue issue) {
        System.out.println("Issue processing started");
        handler.handleRequest(issue);
    }
}
