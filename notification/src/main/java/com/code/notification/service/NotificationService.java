package com.code.notification.service;

import com.code.notification.domain.*;
import com.code.notification.factory.NotificationFactory;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public class NotificationService {
    public void sendNotification(String type, Map<String, Object> data) {
        INotifiacion notification = NotificationFactory.getHandler(type);

        if (notification instanceof EmailNotification email) {
            email.setTo((String) data.get("to"));
            email.setSubject((String) data.get("subject"));
            email.setBody((String) data.get("body"));
            // y así sucesivamente...
            System.out.println("Email preparado: " + email.getBody());
        } else if (notification instanceof SMSNotification sms) {
            sms.setPhoneNumber((String) data.get("phoneNumber"));
            sms.setMessage((String) data.get("message"));
            // etc.
        } else if (notification instanceof PushNotification push) {
            push.setDeviceToken((String) data.get("deviceToken"));
            push.setTitle((String) data.get("title"));
            push.setMessage((String) data.get("message"));
        } else if (notification instanceof WhatsAppNotification wa) {
            wa.setPhoneNumber((String) data.get("phoneNumber"));
            wa.setMessage((String) data.get("message"));
        }
    }
}
