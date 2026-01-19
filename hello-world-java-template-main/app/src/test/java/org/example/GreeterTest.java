package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GreeterTest {
  @Test
  void itHasAGreeting() {
    Greeter greeter = new Greeter();
    assertEquals(greeter.getGreeting(), "Hello World!");
  }
}
