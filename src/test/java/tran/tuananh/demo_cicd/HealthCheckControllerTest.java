package tran.tuananh.demo_cicd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class HealthCheckControllerTest {

  @InjectMocks private HealthCheckController healthCheckController;

  @Test
  void testHealthCheck1() {
    assertEquals("Bad", healthCheckController.healthCheck());
  }
}
