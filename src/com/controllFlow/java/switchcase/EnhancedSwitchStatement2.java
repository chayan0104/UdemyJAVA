
package com.controllFlow.java.switchcase;
public class EnhancedSwitchStatement2 {

    public static void main(String[] args) {
        //String month = "XYZ";
        String month = "JUNE";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }

    public static String getQuarter(String month) {

        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> { yield "1st"; }
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse; //WE CANNOT USE RETURN HERE, yield is replacement of Return
            }
        };

    }
}
