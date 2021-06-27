package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(6);
        a.add(7);
        List<Integer> b = new ArrayList<>();
        b.add(3);
        b.add(6);
        b.add(10);
        System.out.println(compareTriplets(a, b));
    }


    private static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> resultList = new ArrayList<>();
        int alice = 0;
        int bob = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                alice += 1;
            } else if (a.get(i) < b.get(i)) {
                bob += 1;
            }
        }
        resultList.add(alice);
        resultList.add(bob);
        return resultList;
    }

}
