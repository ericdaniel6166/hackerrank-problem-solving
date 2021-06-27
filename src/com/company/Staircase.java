package com.company;


import java.io.IOException;

public class Staircase {
    public static void main(String[] args) throws IOException {
        staircase(4);
    }


    private static void staircase(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j < n - 1) {
                    stringBuilder.append(" ");
                } else {
                    stringBuilder.append("#");
                }
            }
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder);
    }

}
