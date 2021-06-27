package com.company;

import java.util.ArrayList;
import java.util.List;

public class MiniMaxSum {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        miniMaxSum(arr);
    }

    private static void miniMaxSum(List<Integer> arr) {
        long min = arr.get(0);
        long max = min;
        long sum = min;
        for (int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if (min > arr.get(i)){
                min = arr.get(i);
            }
            if (max < arr.get(i)){
                max = arr.get(i);
            }
        }
        System.out.println((sum - max) + " " + (sum - min));
    }

}
