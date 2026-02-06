package java.cicdpractice.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class HealthResponse {
  private Boolean status;
  private String message;
}
