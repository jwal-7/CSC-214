package org.example;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    PayCalc payCalc;
    payCalc = new PayCalc();

    PayPrint payPrint;
    payPrint = new PayPrint();

    Scanner in = new Scanner(System.in);

    System.out.println("Welcome to the Payroll Calculator!");
    System.out.println("Enter number of hours worked: ");
    double hoursWorked = in.nextDouble();
    System.out.println("Enter number of dependents: ");
    int numDependents = in.nextInt();

    in.close();

    double grossPay = payCalc.calcGrossPay(hoursWorked);
    payPrint.printAllPayInfo(hoursWorked,grossPay,numDependents);
  }
}
