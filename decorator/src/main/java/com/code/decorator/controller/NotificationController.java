package com.code.decorator.controller;

import com.code.decorator.service.NotificationService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/notifications")
@AllArgsConstructor
public class NotificationController {
    private final NotificationService notificationService;


    @PostMapping
    public ResponseEntity<String> sendNotification(@RequestBody NotificationRequest request) {
        String result = notificationService.sendNotification(request.getMessage(), request.getDecorators());
        return ResponseEntity.ok("✅ Notificación enviada: " + result);
    }

    public static class NotificationRequest {
        private String message;
        private List<String> decorators;

        public String getMessage() { return message; }
        public void setMessage(String message) { this.message = message; }
        public List<String> getDecorators() { return decorators; }
        public void setDecorators(List<String> decorators) { this.decorators = decorators; }
    }
}
