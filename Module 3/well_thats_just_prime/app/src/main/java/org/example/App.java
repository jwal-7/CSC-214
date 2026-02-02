package org.example;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Factorizer factorizer = new Factorizer();

    System.out.println("Welcome to the Prime Factorization application!");
    System.out.println("Input an integer: ");
    int input = in.nextInt();
    System.out.println("Prime factors: " + factorizer.primeFactors(input));

    System.out.println("\nSample tests:");
    System.out.println("0: " + factorizer.primeFactors(0));
    System.out.println("1: " + factorizer.primeFactors(1));
    System.out.println("9: " + factorizer.primeFactors(9));
    System.out.println("10: " + factorizer.primeFactors(10));
  }
}
