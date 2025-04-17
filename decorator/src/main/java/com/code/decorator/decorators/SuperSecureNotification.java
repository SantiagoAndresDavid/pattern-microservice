package com.code.decorator.decorators;

import com.code.decorator.model.Notification;

public class SuperSecureNotification extends NotifiacionDecorator{
    public SuperSecureNotification(Notification decoratedNotification) {
        super(new UppercaseNotification(new EncryptedNotification(new LoggedNotification(decoratedNotification))));
    }

    @Override
    public String send() {
        return super.send();  // 🔥 Primero cifra, luego convierte en mayúsculas
    }
}
