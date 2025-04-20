package com.code.notification.domain;

import com.code.notification.config.NotificationType;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class WhatsAppNotification implements INotifiacion {
    private String phoneNumber;
    private String message;
    private String mediaUrl;
    private String caption;
    private List<String> interactiveButtons;
    private String language;

    @Override
    public void send() {

    }
}
