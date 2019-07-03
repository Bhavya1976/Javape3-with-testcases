package main.java.com.stackroute.pe3;

import java.util.Scanner;

public class StudentMarks {
    public static int[] studentMarksCalculation( int[] stuGrades) {

        int output[];
        for (int i = 0; i < stuGrades.length; i++) {
            try {
                if (stuGrades[i] > 0 && stuGrades[i] < 100) {

                } else {
                    throw new Exception("InputIsOutOfRange");
                }
            } catch (Exception e) {
                System.out.println("number out of range exception");
            } finally {
                System.out.println("given nunber is less than actual number");
            }

        }
        return stuGrades;
    }
}



