package com.example.test;

import static org.junit.jupiter.api.Assertions.*;

import com.example.test.endpoint.rest.controller.Addition;
import org.junit.jupiter.api.Test;

public class AdditionTest {
  private final Addition subject = new Addition();

  @Test
  void addition_test_ok() {
    assertEquals(3, subject.add(1, 2));
  }
}
