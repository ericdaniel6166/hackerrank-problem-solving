package test.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add(null);
        a.add("1");
        a.add("2");
        String b = "1";
        Calendar start1 = Calendar.getInstance();
        Long startMs1 = start1.getTimeInMillis();
        for (String i : a) {
            if (i == null) {
                System.out.println("null");
                continue;
            }
            if (b.equals(i)) {
                System.out.println("true");
                continue;
            }
            System.out.println("false");
        }
//        for (String i : a) {
//            if (i != null) {
//                if (b.equals(i)) {
//                    System.out.println("true");
//                } else {
//                    System.out.println("false");
//                }
//            } else {
//                System.out.println("null");
//            }
//        }
        Calendar end1 = Calendar.getInstance();
        Long endMs1 = end1.getTimeInMillis();
        System.out.println("ms: " + (endMs1 - startMs1));

    }
}
