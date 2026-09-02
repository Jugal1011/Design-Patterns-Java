package com.design_patterns.chain_of_responsibility;

public class Main {

    public static void main(String[] args) {
        // -> Chain Of Reponsibility
        Client client = new Client(new ChatbotHandler(new CustomerExecutiveHandler(new TechnicalTeamHandler())));
        client.raiseIssue(new Issue(2, "INITIATED"));
    }

}
