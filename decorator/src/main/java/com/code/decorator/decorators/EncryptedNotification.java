package com.code.decorator.decorators;

import com.code.decorator.model.Notification;

import java.util.Base64;

public class EncryptedNotification extends NotifiacionDecorator{

    public EncryptedNotification(Notification decoratedNotification) {
        super(decoratedNotification);
    }

    @Override
    public String send() {
        String originalMessage = super.send();
        return Base64.getEncoder().encodeToString(originalMessage.getBytes());
    }
}
