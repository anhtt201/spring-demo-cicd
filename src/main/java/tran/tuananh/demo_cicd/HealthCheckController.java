package tran.tuananh.demo_cicd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HealthCheckController {

  @Autowired private UserRepository userRepository;

  @GetMapping("/")
  public String healthCheck() {
    return "Good";
  }

  @GetMapping("/users")
  public List<UserEntity> getAllUsers() {
    return userRepository.findAll();
  }
}
