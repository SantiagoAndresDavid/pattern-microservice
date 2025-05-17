package com.code.notification.controllers.dto;

import com.code.notification.domain.EmailNotification;
import lombok.Getter;

import java.util.List;


public record EmailNotificationRecord(
        String to,
        String subject,
        String body,
        List<String> cc,
        List<String> bcc,
        List<String> attachments,
        String priority
) {
    public EmailNotification toEmailNotification() {
        EmailNotification notification = new EmailNotification();
        notification.setTo(this.to);
        notification.setSubject(this.subject);
        notification.setBody(this.body);
        notification.setCc(this.cc);
        notification.setBcc(this.bcc);
        notification.setAttachments(this.attachments);
        notification.setPriority(this.priority);
        return notification;
    }
}
