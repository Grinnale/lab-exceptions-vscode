package lab.exceptions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class QuadraticTests {
  
  @Test
  void sampleRootTest1() {
    assertEquals(-5, (new Quadratic(1, 3, -10)).smallerRoot(), "The smaller root of x^2+3x−10 is -5.");
  }

  @Test
  void sampleRootTest2() {
    assertEquals(-1.5, (new Quadratic(6, 1, -12)).smallerRoot(), "The smaller root of 6x^2+x−12 is -1.5.");
  }

}
