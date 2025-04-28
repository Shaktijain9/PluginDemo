package com.demo.payment;

public interface PaymentGateway {
    void pay(double amount);
    String getName();
}