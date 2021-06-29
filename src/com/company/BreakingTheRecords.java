package com.company;

import java.util.ArrayList;
import java.util.List;

public class BreakingTheRecords {
    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>();
//        scores.add(10);
//        scores.add(5);
//        scores.add(20);
//        scores.add(20);
//        scores.add(4);
//        scores.add(5);
//        scores.add(2);
//        scores.add(25);
//        scores.add(1);

        scores.add(3);
        scores.add(4);
        scores.add(21);
        scores.add(36);
        scores.add(10);
        scores.add(28);
        scores.add(35);
        scores.add(5);
        scores.add(24);
        scores.add(42);
        System.out.println(breakingRecords(scores));


    }

    private static List<Integer> breakingRecords(List<Integer> scores) {
        List<Integer> resultList = new ArrayList<>();
        int countMin = 0;
        int countMax = 0;
        int min = scores.get(0);
        int max = scores.get(0);
        for (int i = 1; i < scores.size(); i++) {
            if (scores.get(i) < min) {
                countMin++;
                min = scores.get(i);
            } else if (scores.get(i) > max) {
                countMax++;
                max = scores.get(i);
            }
        }
        resultList.add(countMax);
        resultList.add(countMin);
        return resultList;
    }

}
