package com.code.decorator.decorators;

import com.code.decorator.model.Notification;

public class UppercaseNotification extends NotifiacionDecorator{
    public UppercaseNotification(Notification decoratedNotification) {
        super(decoratedNotification);
    }

    @Override
    public String send() {  // 🔥 Este método debe estar aquí
        return decoratedNotification.send().toUpperCase();
    }
}
