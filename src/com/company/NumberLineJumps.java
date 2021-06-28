package com.company;

public class NumberLineJumps {
    public static void main(String[] args) {
//        int x1 = 0;
//        int v1 = 3;
//        int x2 = 4;
//        int v2 = 2;
        int x1 = 0;
        int v1 = 2;
        int x2 = 5;
        int v2 = 3;
//        System.out.println(kangaroo(x1, v1, x2, v2));
        System.out.println(kangaroo2(x1, v1, x2, v2));

    }

    private static String kangaroo2(int x1, int v1, int x2, int v2) {
        if (v1 - v2 > 0 && (x2 - x1) % (v1 - v2) == 0) {
            return "YES";
        }
        return "NO";
    }

    private static String kangaroo(int x1, int v1, int x2, int v2) {
        boolean result = false;
        if (v1 - v2 > 0) {
            while (x1 <= x2) {
                x1 = x1 + v1;
                x2 = x2 + v2;
                if (x1 == x2) {
                    result = true;
                    break;
                }
            }
        }
        if (result) {
            return "YES";
        } else {
            return "NO";
        }
    }

}
