package com.example.demo.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handlePaymentError(IllegalArgumentException ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
}