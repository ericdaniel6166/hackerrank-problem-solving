package com.company;

import java.util.ArrayList;
import java.util.List;

public class AppleAndOrange {
    public static void main(String[] args) {
//        The first line contains two space-separated integers denoting the respective values of  and .
//                The second line contains two space-separated integers denoting the respective values of  and .
//                The third line contains two space-separated integers denoting the respective values of  and .
//                The fourth line contains  space-separated integers denoting the respective distances that each apple falls from point .
//                The fifth line contains  space-separated integers denoting the respective distances that each orange falls from point .

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
    }

}
