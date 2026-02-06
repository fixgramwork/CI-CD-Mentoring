package java.cicdpractice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.cicdpractice.controller.dto.HealthResponse;

@RestController

//fdsafds
public class HealthController {
  @GetMapping("/health")
  public ResponseEntity<HealthResponse> checkHealth() {
    return ResponseEntity.ok(new HealthResponse(true, "Successed"));
  }
}
