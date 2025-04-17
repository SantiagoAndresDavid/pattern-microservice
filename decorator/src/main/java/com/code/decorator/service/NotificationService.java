package com.code.decorator.service;

import com.code.decorator.decorators.EncryptedNotification;
import com.code.decorator.decorators.LoggedNotification;
import com.code.decorator.decorators.SuperSecureNotification;
import com.code.decorator.decorators.UppercaseNotification;
import com.code.decorator.model.Notification;
import com.code.decorator.model.SimpleNotifiacion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {
    public String sendNotification(String message, List<String> decorators) {  // 🔥 Agregar List<String> decorators como parámetro
        Notification notification = new SimpleNotifiacion(message);

        for (String decorator : decorators) {  // ✅ Ahora sí existe la variable 'decorators'
            switch (decorator.toLowerCase()) {
                case "encrypt":
                    notification = new EncryptedNotification(notification);
                    break;
                case "uppercase":
                    notification = new UppercaseNotification(notification);
                    break;
                case "log":
                    notification = new LoggedNotification(notification);
                    break;
                case "supersecure":  // 🔥 Nuevo decorador que usa otros decoradores
                    notification = new SuperSecureNotification(notification);
                    break;
                default:
                    throw new IllegalArgumentException("Decorador no soportado: " + decorator);
            }
        }
        return notification.send();
    }
}
