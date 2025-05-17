package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.factory.PaymentFactory;
import com.example.demo.domain.Payment;


@Service
public class PaymentServices {
    public double processPayment(String paymentType, double amount) {
        Payment handler = PaymentFactory.getHandler(paymentType);
        return handler.process(amount);
    }
}