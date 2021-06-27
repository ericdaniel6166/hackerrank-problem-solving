package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SimpleArraySum {
    public static void main(String[] args) throws IOException {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(10);
        integerList.add(11);
        System.out.println(simpleArraySum((integerList)));
    }

    private static int simpleArraySum(List<Integer> ar) {
        int sum = 0;
        for (Integer element : ar) {
            sum += element;
        }
        return sum;
    }

}
