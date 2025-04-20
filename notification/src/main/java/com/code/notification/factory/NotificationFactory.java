package com.code.notification.factory;

import com.code.notification.domain.*;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class NotificationFactory {
    // Static map that contains the registered notification handlers
    private static final Map<String, INotifiacion> handlers = new HashMap<>();

    // Static block that registers the notification handlers when the application starts
    static {
        registerHandler("Email", new EmailNotification());
        registerHandler("SMS", new SMSNotification());
        registerHandler("Push", new PushNotification());
        registerHandler("WhatsApp", new WhatsAppNotification());
    }

    // Method to register a handler in the map
    private static void registerHandler(String type, INotifiacion handler) {
        handlers.put(type, handler);
    }

    public static INotifiacion getHandler(String type) {
        INotifiacion handler = handlers.get(type);
        // If the handler is not found, an exception is thrown
        if (handler == null) {
            throw new IllegalArgumentException("Unsupported notification type: " + type);
        }
        return handler;
    }
}
