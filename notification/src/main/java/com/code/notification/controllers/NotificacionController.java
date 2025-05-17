package com.code.notification.controllers;

import com.code.notification.controllers.dto.SMSNotificacionRecord;
import com.code.notification.domain.SMSNotification;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notifications")
public class NotificacionController {

    @Operation(summary = "Generar un reporte de pago en PDF", description = "Genera un reporte PDF basado en la configuración y datos proporcionados")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Reporte generado exitosamente"),
            @ApiResponse(responseCode = "400", description = "Solicitud inválida"),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    @PostMapping("/sms")
    public ResponseEntity<String> sendSms(@RequestBody SMSNotificacionRecord sms) {
        // Aquí puedes usar sms.toSMSNotification() si necesitas la clase mutable
        SMSNotification notification = sms.toSMSNotification();
        return ResponseEntity.ok("SMS recibido: " + notification);
    }
}
