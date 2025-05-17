package com.example.demo.controllers;

import com.example.demo.service.PaymentServices;
import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping("/pagos")
    public class PaymentController {

        private final PaymentServices paymentServices;

        public PaymentController(PaymentServices paymentServices) {
            this.paymentServices = paymentServices;
        }

        @PostMapping("/{tipoPago}")
        public double procesarPago(
                @PathVariable String tipoPago,
                @RequestParam double monto) {
            return paymentServices.processPayment(tipoPago, monto);
        }
    }
