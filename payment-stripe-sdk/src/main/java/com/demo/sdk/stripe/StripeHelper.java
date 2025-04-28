package com.demo.sdk.stripe;

public class StripeHelper {
    public static void processPayment(double amount) {
        System.out.println("Processed Stripe SDK payment of $" + amount * 0.9);
    }
}