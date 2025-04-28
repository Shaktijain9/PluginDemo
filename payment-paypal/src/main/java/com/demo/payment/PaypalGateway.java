package com.demo.payment;

import com.demo.sdk.paypal.PaypalHelper;

public class PaypalGateway implements PaymentGateway {
    @Override
    public void pay(double amount) {
        PaypalHelper.processPayment(amount);
    }

    @Override
    public String getName() {
        return "PayPal";
    }
}