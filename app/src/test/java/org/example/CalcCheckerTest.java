package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class CalcCheckerTest {

  CalcChecker calcChecker;

  @BeforeEach
  void setUp(){
  calcChecker = new CalcChecker();
  }

  @Test
  void CalculateCheckZeroHours() {
  assertEquals(calcChecker.grossPay(0), calcChecker);
  }

  void CalculateNoTaxes() {
    assertEquals(calcChecker.Taxes(0), calcChecker);
  }
}
