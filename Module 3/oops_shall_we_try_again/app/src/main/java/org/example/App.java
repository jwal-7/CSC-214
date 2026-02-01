package org.example;
import java.util.Scanner;

public class App {
  public static int getInput() {
    Scanner in = new Scanner(System.in);

    boolean isValid = false;

    while (!isValid) {
      System.out.println("Enter an integer between 0 and 100 (inclusive): ");
      int userInput = in.nextInt();

      if (userInput < 0 || userInput > 100) {
        System.out.println("Invalid input, try again");
      } else {
        isValid = true;
        System.out.println("User inputted: " + userInput);
        in.close();
        return 0;
      }
    }

    return -1;
  }

  public static void main(String[] args) {

    System.out.println("Welcome to the input validator!");
    App.getInput();

  }
}
