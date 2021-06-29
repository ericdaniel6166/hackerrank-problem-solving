package com.company;

import java.util.ArrayList;
import java.util.List;

public class SubarrayDivision {
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();
        s.add(2);
        s.add(2);
        s.add(1);
        s.add(3);
        s.add(2);
        s.add(1);
        int d = 4;
        int m = 3;

//        s.add(2);
//        s.add(2);
//        s.add(1);
//        s.add(3);
//        s.add(2);
//        int d = 4;
//        int m = 2;

//        s.add(1);
//        s.add(2);
//        s.add(1);
//        s.add(3);
//        s.add(2);
//        int d = 3;
//        int m = 2;

//        s.add(1);
//        s.add(1);
//        s.add(1);
//        s.add(1);
//        s.add(1);
//        s.add(1);
//        int d = 3;
//        int m = 2;

//        s.add(4);
//        int d = 4;
//        int m = 1;
//        System.out.println(birthday(s,d,m));
        System.out.println(birthday2(s, d, m));


    }

    private static int birthday2(List<Integer> s, int d, int m) {
        if (m > s.size()) {
            return 0;
        }
        int count = 0;
        int sum = 0;
        for (int i = 0; i < m - 1; i++) {
            sum += s.get(i);
        }
        for (int j = m - 1; j < s.size(); j++) {
            if (j >= m) {
                sum -= s.get(j - m);
            }
            sum += s.get(j);
            if (sum == d) {
                count++;
            }
        }
        return count;

    }

    private static int birthday(List<Integer> s, int d, int m) {
        if (m > s.size()) {
            return 0;
        }
        int count = 0;
        int sum = 0;
        for (int i = 0; i < m - 1; i++) {
            sum += s.get(i);
        }
        for (int j = m - 1; j < s.size(); j++) {
            sum -= (j - m) < 0 ? 0 : s.get(j - m);
            sum += s.get(j);
            if (sum == d) {
                count++;
            }
        }
        return count;

    }

}
