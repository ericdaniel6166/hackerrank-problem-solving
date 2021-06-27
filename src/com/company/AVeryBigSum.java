package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AVeryBigSum {
    public static void main(String[] args) throws IOException {
        List<Long> ar = new ArrayList<>();
        ar.add(1000000001L);
        ar.add(1000000002L);
        ar.add(1000000003L);
        ar.add(1000000004L);
        ar.add(1000000005L);
        System.out.println(aVeryBigSum(ar));
    }

    private static long aVeryBigSum(List<Long> ar) {
        long sum = 0L;
        for (long element : ar) {
            sum += element;
        }
        return sum;
    }

}
