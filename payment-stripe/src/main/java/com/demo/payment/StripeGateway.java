package com.demo.payment;

import com.demo.sdk.stripe.StripeHelper;

public class StripeGateway implements PaymentGateway {
    @Override
    public void pay(double amount) {
        StripeHelper.processPayment(amount);
    }

    @Override
    public String getName() {
        return "Stripe";
    }
}