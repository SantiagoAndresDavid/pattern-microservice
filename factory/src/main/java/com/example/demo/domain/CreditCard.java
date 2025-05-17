package com.example.demo.domain;

public class CreditCard implements Payment {
    @Override
    public double process(double amount) {
        double commissionRate = 0.03;
        double finalAmount = amount + (amount * commissionRate);
        System.out.println("Procesando tarjeta de crédito");

        if (amount > 1000) finalAmount += 10;
        return finalAmount;
    }
}