package com.company;

import java.util.ArrayList;
import java.util.List;

public class DivisibleSumPairs {
    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<>();
        int n = 6;
        int k = 3;
        ar.add(1);
        ar.add(3);
        ar.add(2);
        ar.add(6);
        ar.add(1);
        ar.add(2);
        System.out.println(divisibleSumPairs(n, k, ar));

    }

    private static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((ar.get(i) + ar.get(j)) % k == 0) {
                    count++;
                }
            }

        }
        return count;

    }

}
