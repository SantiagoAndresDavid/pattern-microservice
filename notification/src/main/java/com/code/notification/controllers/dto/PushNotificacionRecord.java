package com.code.notification.controllers.dto;

import com.code.notification.domain.PushNotification;

public record PushNotificacionRecord(String deviceToken,
                                     String title,
                                     String message,
                                     String imageUrl,
                                     String clickAction,
                                     String priority) {
    public PushNotification toPushNotification() {
        PushNotification notification = new PushNotification();
        notification.setDeviceToken(this.deviceToken);
        notification.setTitle(this.title);
        notification.setMessage(this.message);
        notification.setImageUrl(this.imageUrl);
        notification.setClickAction(this.clickAction);
        notification.setPriority(this.priority);
        return notification;
    }
}
