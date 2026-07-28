package com.design_patterns.chain_of_responsibility;

public class TechnicalTeamHandler implements RequestHandler{
    @Override
    public void handleRequest(Issue issue) {
        if (issue.getPriority() == 3) {
            issue.setStatus("SUCCESS");
            System.out.println("Issue solved by technical team");
        } else {
            System.out.println("Issue cannot be solved");
            issue.setStatus("FAILED");
        }
    }
}
