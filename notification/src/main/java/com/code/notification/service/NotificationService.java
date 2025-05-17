package com.code.notification.service;

import com.code.notification.domain.*;
import com.code.notification.factory.NotificationFactory;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.Map;
@Service
public class NotificationService {

    public void sendNotification(String type, Map<String, Object> data) {
        // Obtener el manejador de notificación desde la fábrica
        INotifiacion notification = NotificationFactory.getHandler(type);

        // Configurar las propiedades del objeto de notificación
        populateNotificationProperties(notification, data);

        // Enviar la notificación
        notification.send();
    }

    private void populateNotificationProperties(INotifiacion notification, Map<String, Object> data) {
        Class<?> clazz = notification.getClass();
        data.forEach((key, value) -> {
            try {
                Field field = clazz.getDeclaredField(key);
                field.setAccessible(true);
                field.set(notification, value);
            } catch (NoSuchFieldException | IllegalAccessException e) {
                throw new RuntimeException("Error setting property: " + key, e);
            }
        });
    }
}
