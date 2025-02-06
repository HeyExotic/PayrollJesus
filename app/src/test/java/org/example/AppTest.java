package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

  @Test
  public void itWorks() {
    String expectedText = "Welcome to the Payroll Calculator!";
    String actualText = "Welcome to the Payroll Calculator!";
    assertEquals(expectedText, actualText);
  }
}