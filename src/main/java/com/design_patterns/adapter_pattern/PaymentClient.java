package com.design_patterns.adapter_pattern;

public class PaymentClient {

    PaymentService paymentService;

    public PaymentClient(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void makePayment() {
        String result = paymentService.payClient(100, 123);

        if (result.equals("SUCCESS")) {
            System.out.println("Payment Done Successfully!");
        } else {
            System.out.println("Payment Failed!");
        }
    }
}
