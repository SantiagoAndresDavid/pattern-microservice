package com.code.notification.domain;

import com.code.notification.config.NotificationType;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class PushNotification implements INotifiacion{
    private String deviceToken;
    private String title;
    private String message;
    private String imageUrl;
    private String clickAction;
    private String priority; // "urgente", "normal"

    @Override
    public void send() {

    }
}
