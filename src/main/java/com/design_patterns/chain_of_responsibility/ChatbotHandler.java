package com.design_patterns.chain_of_responsibility;

public class ChatbotHandler implements RequestHandler {

    private RequestHandler nextRequesthandler;

    public ChatbotHandler(RequestHandler nextRequesthandler) {
        this.nextRequesthandler = nextRequesthandler;
    }

    @Override
    public void handleRequest(Issue issue) {
        if (issue.getPriority() == 1) {
            issue.setStatus("SUCCESS");
            System.out.println("Issue solved by chatbot");
        } else {
            System.out.println("Issue sent to next handler");
            nextRequesthandler.handleRequest(issue);
        }
    }

}
