package com.design_patterns.adapter_pattern;

public class RazorPayPaymentAdapter implements PaymentService {

    RazorPayGateway razorPayGateway;

    public RazorPayPaymentAdapter(RazorPayGateway razorPayGateway) {
        this.razorPayGateway = razorPayGateway;
    }

    @Override
    public String payClient(int amount, int customerId) {
        boolean result = this.razorPayGateway.payUsingRazorPay(Double.valueOf(amount), customerId);

        if (result) {
            return "SUCCESS";
        }
        return "FAILED";
    }

}
