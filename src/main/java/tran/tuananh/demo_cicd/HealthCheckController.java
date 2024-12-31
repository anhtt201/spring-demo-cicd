package tran.tuananh.demo_cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

  @GetMapping("/")
  public String healthCheck() {
    return "Good";
  }
}
