package org.example;

import java.util.ArrayList;

public class Factorizer {
  public ArrayList<Integer> primeFactors(Integer n) {
    if (n <= 1) {
      return new ArrayList<>();
    }

    ArrayList<Integer> listOfPrimeFactors = new ArrayList<>();

    for (int i = 2; i * i <= n; i++) {
      while (n % i == 0) {
        listOfPrimeFactors.add(i);
        n = n / i;
      }
    }

    if (n > 1) {
      listOfPrimeFactors.add(n);
    }
    return listOfPrimeFactors;

  }
}
