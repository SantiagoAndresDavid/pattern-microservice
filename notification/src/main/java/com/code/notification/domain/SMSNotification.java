package com.code.notification.domain;

import com.code.notification.config.NotificationType;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
public class SMSNotification implements INotifiacion {
    private String phoneNumber;
    private String message;
    private String senderId;
    private boolean deliveryReportRequired;
    private LocalDateTime scheduleTime;

    @Override
    public void send() {

    }
}
