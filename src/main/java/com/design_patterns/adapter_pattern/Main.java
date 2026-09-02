package com.design_patterns.adapter_pattern;

public class Main {

    public static void main(String[] args) {
        // -> Adapter Design Pattern
        PaymentService paymentService = new PayPalPaymentAdapter(new PayPalGateway());
        PaymentClient paymentClient = new PaymentClient(paymentService);
        paymentClient.makePayment();

        PaymentService paymentService1 = new RazorPayPaymentAdapter(new RazorPayGateway());
        PaymentClient paymentClient1 = new PaymentClient(paymentService1);
        paymentClient1.makePayment();
    }

}
