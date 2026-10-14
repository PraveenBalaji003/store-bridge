package com.storebridge.shop_connector.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
public class HealthController {

    @GetMapping("/ping")
    public Map<String, Object> ping() {
        return Map.of(
                "app", "StoreBridge",
                "status", "Running",
                "time", LocalDateTime.now().toString()
                );
    }
}
