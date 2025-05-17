package com.example.demo.domain;

public class DebitCard implements Payment {
    @Override
    public double process(double amount) {
        double commissionRate = 0.01;
        double finalAmount = amount + (amount * commissionRate);
        System.out.println("Procesando tarjeta de débito");

        if (amount > 500) finalAmount += 5;
        return finalAmount;
    }
}