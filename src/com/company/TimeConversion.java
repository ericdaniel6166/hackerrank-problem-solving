package com.company;

public class TimeConversion {
    public static void main(String[] args) {
//        String s = "07:05:45PM";
//        String s = "12:01:00PM";
        String s = "12:01:00AM";
//        String s = "00:01:00AM";
//        String s = "00:01:00PM";
        System.out.println(timeConversion(s));
    }

    private static String timeConversion(String s) {
        String hour = s.substring(0, 2);
        int hourInt = Integer.parseInt(hour);
        String minAndSec = s.substring(2, 8);
        String amOrPM = s.substring(8, 10);
        StringBuilder stringBuilder = new StringBuilder();
        if ("AM".equals(amOrPM)) {
            if ("12".equals(hour))
            hour = "00";
        } else if (!"12".equals(hour)) {
            hourInt += 12;
            hour = String.valueOf(hourInt);
        }

        stringBuilder.append(hour).append(minAndSec);
        return stringBuilder.toString();
    }

}
