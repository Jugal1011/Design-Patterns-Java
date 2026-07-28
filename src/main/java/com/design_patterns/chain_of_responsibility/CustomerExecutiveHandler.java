package com.design_patterns.chain_of_responsibility;

public class CustomerExecutiveHandler implements RequestHandler {

    private RequestHandler nextRequesthandler;

    public CustomerExecutiveHandler(RequestHandler nextRequesthandler) {
        this.nextRequesthandler = nextRequesthandler;
    }

    @Override
    public void handleRequest(Issue issue) {
        if (issue.getPriority() == 2) {
            issue.setStatus("SUCCESS");
            System.out.println("Issue solved by customer executive");
        } else {
            System.out.println("Issue sent to next handler");
            nextRequesthandler.handleRequest(issue);
        }
    }

}
