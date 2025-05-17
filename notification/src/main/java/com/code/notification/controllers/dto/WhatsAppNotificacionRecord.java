package com.code.notification.controllers.dto;

import com.code.notification.domain.WhatsAppNotification;

import java.util.List;

public record WhatsAppNotificacionRecord(String phoneNumber,
                                         String message,
                                         String mediaUrl,
                                         String caption,
                                         List<String> interactiveButtons,
                                         String language) {
    public WhatsAppNotification toWhatsAppNotification() {
        WhatsAppNotification notification = new WhatsAppNotification();
        notification.setPhoneNumber(this.phoneNumber);
        notification.setMessage(this.message);
        notification.setMediaUrl(this.mediaUrl);
        notification.setCaption(this.caption);
        notification.setInteractiveButtons(this.interactiveButtons);
        notification.setLanguage(this.language);
        return notification;
    }
}
