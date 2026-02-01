package org.example;
import java.util.Scanner;

public class App {
  public static int getInput(String prompt, int lowerBound, int upperBound, String errorMessage) {
    Scanner in = new Scanner(System.in);

    boolean isValid = false;

    while (!isValid) {
      System.out.println(prompt);
      int userInput = in.nextInt();

      if (userInput < lowerBound || userInput > upperBound) {
        System.out.println(errorMessage);
      } else {
        isValid = true;
        System.out.println("User inputted: " + userInput);
        return userInput;
      }
    }
    return -1;
  }

  public static void main(String[] args) {

    System.out.println("Welcome to the input validator!");
    App.getInput("Enter an integer between 0 and 100 (inclusive): ", 0,
            100, "Invalid input, try again" );

    App.getInput("Enter an integer between 1 and 4 (inclusive): ", 1,
           4, "Invalid input, try again" );

    App.getInput("Enter an integer between -1 and 1 (inclusive): ", -1,
            1, "Invalid input, try again" );

  }
}
