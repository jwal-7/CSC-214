package org.example;

public class PayPrint {

         PayCalc payCalc;


    public void printAllPayInfo(double hoursWorked, double amtGrossPay, int amtDependents) {
        payCalc = new PayCalc();

        System.out.println("\nPayroll Stub:");
        System.out.println("\nHours: " +  String.format("%3c", ' ') + String.format("%.2f", hoursWorked));
        System.out.println("Rate: " + String.format("%4c", ' ') + String.format("%.2f", payCalc.hourlyRate) + " $/hr");
        System.out.println("Gross: " + String.format("%4c", '$') + " " + String.format("%.2f", amtGrossPay));
        System.out.println("\nSocSec: " + String.format("%3c", '$') + " " + String.format("%.2f", payCalc.calcSSTax(amtGrossPay)));
        System.out.println("FedTax: " + String.format("%3c", '$') + " " + String.format("%.2f", payCalc.calcFedIncomeTax(amtGrossPay)));
        System.out.println("StTax: " + String.format("%4c", '$') + " " + String.format("%.2f", payCalc.calcStateIncomeTax(amtGrossPay)));
        System.out.println("Union: " + String.format("%4c", '$') + " " + "10.00");
        System.out.println("Ins: " + String.format("%6c", '$') + " " + String.format("%.2f", payCalc.calcHealthInsurance(amtDependents)));
        System.out.println("\nNet: " + String.format("%6c", '$') + " " + String.format("%.2f", payCalc.calcNetExpenses(amtGrossPay, amtDependents)));
        System.out.println("\nThank you for using the Payroll Program!");

    }
}
