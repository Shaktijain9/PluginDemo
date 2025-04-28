package com.demo.payment;

import com.demo.sdk.razorpay.RazorpayHelper;

public class RazorpayGateway implements PaymentGateway {
    @Override
    public void pay(double amount) {
        RazorpayHelper.processPayment(amount);
    }

    @Override
    public String getName() {
        return "Razorpay";
    }
}