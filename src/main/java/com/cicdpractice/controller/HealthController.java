package com.cicdpractice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cicdpractice.controller.dto.HealthResponse;

@RestController

//fdsafdsfdsafsffaf
public class HealthController {
  @GetMapping("/health")
  public ResponseEntity<HealthResponse> checkHealth() {
    return ResponseEntity.ok(new HealthResponse(true, "Successed"));
  }
}
