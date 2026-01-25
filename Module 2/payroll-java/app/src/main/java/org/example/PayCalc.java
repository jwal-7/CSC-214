package org.example;

public class PayCalc {

    public final double hourlyRate = 16.78;

    public double calcGrossPay(double hours) {
        if (hours > 40) {
            double timeInOvertime = hours - 40;
            return (40 * hourlyRate) + (timeInOvertime * (hourlyRate * 1.5));
        } else {
            return (hours * hourlyRate);
        }
    }

    public double calcSSTax(double grossPay) {
        return grossPay * 0.06;
    }

    public double calcFedIncomeTax(double grossPay) {
        return grossPay * 0.14;
    }

    public double calcStateIncomeTax(double grossPay) {
        return grossPay * 0.05;
    }

    public double calcHealthInsurance(int numDependents) {
        if (numDependents >= 3) {
            return 35.00;
        } else {
            return 15.00;
        }
    }

    public double calcNetExpenses(double amtGrossPay, int amtDependents) {
        double netPay = amtGrossPay;
        netPay -= (calcSSTax(amtGrossPay) + calcFedIncomeTax(amtGrossPay) + calcStateIncomeTax(amtGrossPay)
                + calcHealthInsurance(amtDependents) + 10); // +10 for union dues
        return netPay;
    }



}
