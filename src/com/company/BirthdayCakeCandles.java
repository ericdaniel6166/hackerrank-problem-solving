package com.company;

import java.util.ArrayList;
import java.util.List;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        List<Long> candles = new ArrayList<>();
        candles.add(3L);
        candles.add(2L);
        candles.add(1L);
        candles.add(3L);
        System.out.println(birthdayCakeCandles(candles));
    }

    private static int birthdayCakeCandles(List<Long> candles) {
        long max = candles.get(0);
        int count = 1;
        for (int i = 1; i < candles.size(); i++) {
            if (max == candles.get(i)) {
                count++;
            } else if (max < candles.get(i)) {
                max = candles.get(i);
                count = 1;
            }
        }
        return count;
    }

}
