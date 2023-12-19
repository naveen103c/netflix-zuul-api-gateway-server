package com.naveen.netflixzuulapigatewayserver.contoller;

import com.naveen.netflixzuulapigatewayserver.dto.HealthResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

  @GetMapping(
      path = "/",produces = { "application/json"}
  )
  public HealthResponse getHealth() {
    return new HealthResponse("UP");
  }
  
}
