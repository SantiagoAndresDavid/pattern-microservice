package com.code.notification.controllers.dto;

import com.code.notification.domain.SMSNotification;

import java.time.LocalDateTime;

public record SMSNotificacionRecord(String phoneNumber,
                                    String message,
                                    String senderId,
                                    boolean deliveryReportRequired,
                                    LocalDateTime scheduleTime) {
    public SMSNotification toSMSNotification() {
        SMSNotification notification = new SMSNotification();
        notification.setPhoneNumber(this.phoneNumber);
        notification.setMessage(this.message);
        notification.setSenderId(this.senderId);
        notification.setDeliveryReportRequired(this.deliveryReportRequired);
        notification.setScheduleTime(this.scheduleTime);
        return notification;
    }
}
