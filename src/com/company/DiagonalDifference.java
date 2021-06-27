package com.company;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {

        List<Integer> ar0 = new ArrayList<>();
        ar0.add(11);
        ar0.add(2);
        ar0.add(4);
        List<Integer> ar1 = new ArrayList<>();
        ar1.add(4);
        ar1.add(5);
        ar1.add(6);

        List<Integer> ar2 = new ArrayList<>();
        ar2.add(10);
        ar2.add(8);
        ar2.add(-12);

        List<List<Integer>> arr = new ArrayList<>();
        arr.add(ar0);
        arr.add(ar1);
        arr.add(ar2);
//        System.out.println(diagonalDifference(arr));
        System.out.println(diagonalDifference2(arr));
    }


    private static long diagonalDifference2(List<List<Integer>> arr) {
        int left = 0;
        int right = 0;
        for (int i = 0; i < arr.size(); i++) {
            left += arr.get(i).get(i);
            right += arr.get(i).get(arr.size() - 1 - i);
        }
        return Math.abs(left - right);
    }

    private static long diagonalDifference(List<List<Integer>> arr) {
        int left = 0;
        int right = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                if (i == j) {
                    left += arr.get(i).get(j);
                }
                if (i + j == arr.size() - 1) {
                    right += arr.get(i).get(j);
                }
            }
        }
        return Math.abs(left - right);

    }

}
