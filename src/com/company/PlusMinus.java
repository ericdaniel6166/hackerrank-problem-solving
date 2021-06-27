package com.company;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(-4);
        arr.add(3);
        arr.add(-9);
        arr.add(0);
        arr.add(4);
        arr.add(1);
//        plusMinus(arr);
        plusMinus2(arr);
    }

    private static void plusMinus(List<Integer> arr) {
        double positiveValue = 0;
        double negativeValue = 0;
        double zeroValue = 0;
        for (Integer element : arr) {
            if (element > 0) {
                positiveValue += 1;
            } else if (element < 0) {
                negativeValue += 1;
            } else {
                zeroValue += 1;
            }
        }
        double positiveValueProportion  = positiveValue / arr.size();
        double negativeValueProportion  = negativeValue / arr.size();
        double zeroValueProportion  = zeroValue / arr.size();
        System.out.println(BigDecimal.valueOf(positiveValueProportion).setScale(6, RoundingMode.HALF_UP));
        System.out.println(BigDecimal.valueOf(negativeValueProportion).setScale(6, RoundingMode.HALF_UP));
        System.out.println(BigDecimal.valueOf(zeroValueProportion).setScale(6, RoundingMode.HALF_UP));
    }

    private static void plusMinus2(List<Integer> arr) {
        double positiveValue = 0;
        double negativeValue = 0;
        double zeroValue = 0;
        for (Integer element : arr) {
            if (element > 0) {
                positiveValue += 1;
            } else if (element < 0) {
                negativeValue += 1;
            } else {
                zeroValue += 1;
            }
        }
        double positiveValueProportion  = positiveValue / arr.size();
        double negativeValueProportion  = negativeValue / arr.size();
        double zeroValueProportion  = zeroValue / arr.size();
        System.out.format("%.6f", positiveValueProportion);
        System.out.println();
        System.out.format("%.6f", negativeValueProportion);
        System.out.println();
        System.out.format("%.6f", zeroValueProportion);
    }

}
