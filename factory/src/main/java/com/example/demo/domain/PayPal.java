package com.example.demo.domain;

public class PayPal implements Payment {
    @Override
    public double process(double amount) {
        double commissionRate = 0.02;
        double finalAmount = amount + (amount * commissionRate);
        System.out.println("Procesando PayPal");

        if (amount > 750) finalAmount += 7;
        return finalAmount;
    }
}