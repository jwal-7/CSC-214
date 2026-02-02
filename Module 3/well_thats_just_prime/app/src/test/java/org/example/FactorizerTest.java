package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;

class FactorizerTest {
  @Test
  void itReturnsAnEmptyListForZero() {
    Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.primeFactors(0), new ArrayList<Integer>());
  }

  @Test
  void itReturnsAnEmptyListForOne() {
    Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.primeFactors(1), new ArrayList<Integer>());
  }

  @Test
  void itReturnsAProperListForTwo() {
    Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.primeFactors(2), new ArrayList<Integer>(Arrays.asList(2)));
  }

  @Test
  void itReturnsAProperListForThree() {
    Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.primeFactors(3), new ArrayList<Integer>(Arrays.asList(3)));
  }

  @Test
  void itReturnsAProperListForOneHundred() {
    Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.primeFactors(100), new ArrayList<Integer>(Arrays.asList(2,2,5,5)));
  }

  @Test
  void itReturnsAProperListForThirtyFive() {
    Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.primeFactors(35), new ArrayList<Integer>(Arrays.asList(5,7)));
  }

  @Test
  void itReturnsAProperListForTwentyFour() {
    Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.primeFactors(24), new ArrayList<Integer>(Arrays.asList(2,2,2,3)));
  }

  @Test
  void itReturnsAProperListForSeventeen() {
    Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.primeFactors(17), new ArrayList<Integer>(Arrays.asList(17)));
  }

  @Test
  void itReturnsAProperListForSeventyTwo() {
    Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.primeFactors(72), new ArrayList<Integer>(Arrays.asList(2,2,2,3,3)));
  }

  @Test
  void itReturnsAProperListForOneHundredFortyEight() {
    Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.primeFactors(148), new ArrayList<Integer>(Arrays.asList(2,2,37)));
  }

  @Test
  void itReturnsAProperListForThreeHundredFiftySix() {
    Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.primeFactors(356), new ArrayList<Integer>(Arrays.asList(2,2,89)));
  }
}
