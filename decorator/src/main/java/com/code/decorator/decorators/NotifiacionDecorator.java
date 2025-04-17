package com.code.decorator.decorators;

import com.code.decorator.model.Notification;
import lombok.AllArgsConstructor;

public class NotifiacionDecorator implements Notification {
    protected Notification decoratedNotification;

    public NotifiacionDecorator(Notification decoratedNotification) {
        if (decoratedNotification == null) {
            throw new IllegalArgumentException("La notificación decorada no puede ser null");
        }
        this.decoratedNotification = decoratedNotification;
    }



    @Override
    public String send() {  // 🔥 Este método debe estar aquí
        return decoratedNotification.send();
    }
}
