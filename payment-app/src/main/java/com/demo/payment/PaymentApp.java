package com.demo.payment;
import java.util.ServiceLoader;

public class PaymentApp {
    public static void main(String[] args) {
        ServiceLoader<PaymentGateway> loader = ServiceLoader.load(PaymentGateway.class);

        for (PaymentGateway gateway : loader) {
            System.out.println("Using Gateway: " + gateway.getName());
            gateway.pay(100.0);
        }
    }
}