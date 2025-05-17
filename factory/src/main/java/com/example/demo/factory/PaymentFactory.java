package com.example.demo.factory;

import com.example.demo.domain.*;
import java.util.HashMap;
import java.util.Map;

public class PaymentFactory {
    // Mapa estático que contiene los manejadores de pago registrados
    private static final Map<String, Payment> handlers = new HashMap<>();

    // Bloque estático que registra los manejadores de pago al iniciar la aplicación
    static {
        registerHandler("CREDIT_CARD", new CreditCard());
        registerHandler("DEBIT_CARD", new DebitCard());
        registerHandler("PAYPAL", new PayPal());
    }

    // Método para registrar un nuevo manejador de pago
    public static void registerHandler(String paymentType, Payment handler) {
        handlers.put(paymentType, handler);
    }

    // Método para obtener el manejador de pago correspondiente al tipo de pago
    public static Payment getHandler(String paymentType) {
        Payment handler = handlers.get(paymentType);
        // Si no se encuentra el manejador, se lanza una excepción
        if (handler == null) {
            throw new IllegalArgumentException("Método no soportado: " + paymentType);
        }
        return handler;
    }
}