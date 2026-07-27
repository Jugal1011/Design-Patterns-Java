package com.design_patterns.adapter_pattern;

public class PayPalPaymentAdapter implements PaymentService {

    PayPalGateway payPalGateway;

    public PayPalPaymentAdapter(PayPalGateway payPalGateway) {
        this.payPalGateway = payPalGateway;
    }

    @Override
    public String payClient(int amount, int customerId) {
        int result = this.payPalGateway.payUsingPayPal(Double.valueOf(amount), Double.valueOf(customerId));

        if (result == 1) {
            return "SUCCESS";
        }
        return "FAILED";
    }

}
