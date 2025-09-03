package ranto.co.io;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import ranto.co.io.endpoint.rest.controller.Addition;

public class AdditionTest {
  private final Addition subject = new Addition();

  @Test
  void addition_test_ok() {
    assertEquals(3, subject.add(1, 2));
  }
}
