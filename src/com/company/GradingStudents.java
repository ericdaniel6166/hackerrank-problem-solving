package com.company;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);
//        System.out.println(gradingStudents(grades));
        System.out.println(gradingStudents2(grades));
    }

    private static List<Integer> gradingStudents2(List<Integer> grades) {
        List<Integer> resultList = new ArrayList<>();
        int result = 0;
        for (Integer grade : grades) {
            if (grade < 38 || grade % 5 < 3 ) {
                result = grade;
            } else {
                result = grade + (5 - (grade % 5));
            }
            resultList.add(result);
        }
        return resultList;
    }

    private static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> resultList = new ArrayList<>();
        int result = 0;
        int tensDigit = 0;
        int onesDigit = 0;
        for (Integer grade : grades) {
            tensDigit = grade / 10;
            onesDigit = grade % 10;
            if (grade > 37) {
                if (onesDigit > 0 && onesDigit < 5) {
                    if (5 - onesDigit < 3) {
                        onesDigit = 5;
                    }
                } else if (onesDigit > 5) {
                    if (onesDigit - 5 > 2) {
                        onesDigit = 0;
                        tensDigit += 1;
                    }
                }
            }
            result = tensDigit * 10 + onesDigit;
            resultList.add(result);
        }

        return resultList;
    }

}
