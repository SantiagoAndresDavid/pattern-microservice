package com.code.notification.domain;

import com.code.notification.config.NotificationType;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class EmailNotification implements INotifiacion {
    private String to;
    private String subject;
    private String body;
    private List<String> cc;
    private List<String> bcc;
    private List<String> attachments;
    private String priority;

    @Override
    public void send() {

    }
}
