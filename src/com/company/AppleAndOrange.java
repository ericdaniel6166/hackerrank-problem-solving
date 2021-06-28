package com.company;

import java.util.ArrayList;
import java.util.List;

public class AppleAndOrange {
    public static void main(String[] args) {
        int s = 7;
        int t = 11;
        int a = 5;
        int b = 15;
        List<Integer> apples = new ArrayList<>();
        apples.add(-2);
        apples.add(2);
        apples.add(1);
        List<Integer> oranges = new ArrayList<>();
        oranges.add(5);
        oranges.add(-6);
        countApplesAndOranges(s, t, a, b, apples, oranges);

    }

    private static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int countApple = 0;
        int countOrange = 0;
        for (Integer apple : apples) {
            if (a + apple >= s && a + apple <= t) {
                countApple++;
            }
        }
        for (Integer orange : oranges) {
            if (b + orange >= s && b + orange <= t) {
                countOrange++;
            }
        }
        System.out.println(countApple);
        System.out.println(countOrange);

    }

}
