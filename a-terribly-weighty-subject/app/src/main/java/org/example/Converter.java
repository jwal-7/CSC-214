package org.example;

public class Converter {

    public static String toPounds(double ounces) {
        double pounds = ounces / 16;
        String formatted = String.format("%.4f", pounds); //example from: https://www.geeksforgeeks.org/java/how-to-set-precision-for-double-values-in-java/
        if (formatted.equals("1.0000")) {
            String output = formatted + " lb";
            return output;
        } else {
            String output = formatted + " lbs";
            return output;
        }


    }

    public static String toPoundsAndOunces(int ounces) {
        int pounds = ounces / 16;
        int andOunces = ounces % 16;
        if (pounds == 1) {
            String output = pounds + " lb " + andOunces + " oz";
            return output;
        }
        else {
            String output = pounds + " lbs " + andOunces + " oz";
            return output;
        }

    }
}
