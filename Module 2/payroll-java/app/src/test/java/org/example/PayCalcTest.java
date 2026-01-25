package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PayCalcTest {
  // You can put your JUnit tests here
  // Feel free to create other files, as needed, to organize your tests

  PayCalc payCalc;

  @BeforeEach
  void setUp() {
    payCalc = new PayCalc();
  }
  /* example test
  @Test
  void itWorks() {
    assertEquals(true, true);
  }*/

  @Test
  void testGrossPayZeroHours() {
    assertEquals(0,payCalc.calcGrossPay(0));
  }

  @Test
  void testGrossPayFifteenHours() {
    assertEquals(251.7,payCalc.calcGrossPay(15),0.001);
  }

  @Test
  void testGrossPayTwentyAndHalfHours() {
    assertEquals(343.99,payCalc.calcGrossPay(20.5),0.001);
  }

  @Test
  void testGrossPayFortyFiveHours() {
    assertEquals(797.05,payCalc.calcGrossPay(45),0.001);
  }

  @Test
  void testSSTaxThreeHundredDollars() {
    assertEquals(18,payCalc.calcSSTax(300),0.001);
  }

  @Test
  void testSSTaxSixHundredFiftyDollars() {
    assertEquals(39,payCalc.calcSSTax(650),0.001);
  }

  @Test
  void testSSTaxSevenHundredNinetySevenDollarsAndFiveCents() {
    assertEquals(47.823,payCalc.calcSSTax(797.05),0.001);
  }

  @Test
  void testFedIncomeTaxThreeHundredDollarsAndTwentyOneCents() {
    assertEquals(42.0294,payCalc.calcFedIncomeTax(300.21),0.001);
  }

  @Test
  void testFedIncomeTaxFourHundredFiftySixDollarsAndFortyEightCents() {
    assertEquals(63.9072,payCalc.calcFedIncomeTax(456.48),0.001);
  }

  @Test
  void testFedIncomeTaxSevenHundredNinetySevenDollarsAndFiveCents() {
    assertEquals(111.587,payCalc.calcFedIncomeTax(797.05),0.001);
  }

  @Test
  void testStateIncomeTaxTwoHundredEightyTwoDollarsAndThirtySevenCents() {
    assertEquals(14.1185,payCalc.calcStateIncomeTax(282.37),0.001);
  }

  @Test
  void testStateIncomeTaxFiveHundredTwentySevenDollarsAndEightyCents() {
    assertEquals(26.39,payCalc.calcStateIncomeTax(527.80),0.001);
  }

  @Test
  void testStateIncomeTaxSevenHundredNinetySevenDollarsAndFiveCents() {
    assertEquals(39.8525,payCalc.calcStateIncomeTax(797.05),0.001);
  }

  @Test
  void testTwoDependents() {
    assertEquals(15,payCalc.calcHealthInsurance(2));
  }

  @Test
  void testThreeDependents() {
    assertEquals(35,payCalc.calcHealthInsurance(3));
  }

  @Test
  void testNineDependents() {
    assertEquals(35,payCalc.calcHealthInsurance(9));
  }

  @Test
  void testNetPayFortyFiveHoursOneDependent() {
    assertEquals(572.7875,payCalc.calcNetExpenses(797.05,1),0.001);
  }

  @Test
  void testNetPayFortyFiveHoursFourDependents() {
    assertEquals(552.7875,payCalc.calcNetExpenses(797.05,4),0.001);
  }

}

