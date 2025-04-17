package com.code.decorator.decorators;

import com.code.decorator.model.Notification;

public class LoggedNotification extends NotifiacionDecorator{
    public LoggedNotification(Notification decoratedNotification) {
        super(decoratedNotification);
    }

    @Override
    public String send() {
        String message = super.send();
        System.out.println("LOG: Enviando notificación -> " + message);
        return message;
    }
}
