package org.example;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Converter converter;
    converter = new Converter();

    Scanner in = new Scanner(System.in);
    System.out.println("Welcome to the Ounce Conversion Program!");
    System.out.print("\nHow many ounces do you have? ");
    int ouncesIn = in.nextInt();
    System.out.println("Thank you! Converting ounces to pounds.\n");

    String poundsAndOunces = converter.toPoundsAndOunces(ouncesIn);
    String poundsOnly = converter.toPounds(ouncesIn);

    System.out.println(ouncesIn + " oz is equivalent to " + poundsAndOunces);
    System.out.println(ouncesIn + " oz is equivalent to " + poundsOnly);

    System.out.println("\nThank you for using the OCP!");
  }
}
