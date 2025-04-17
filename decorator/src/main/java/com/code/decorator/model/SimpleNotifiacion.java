package com.code.decorator.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SimpleNotifiacion implements Notification{
    private final String message;

    @Override
    public String send() {
        return message;
    }
}
