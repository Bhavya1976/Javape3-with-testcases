package main.java.com.stackroute.pe3;

import java.util.Scanner;

public class StudentMarks {

    public static String studentMarksDisplay(int[]grades){
        String result="";

        for(int i=0;i<grades.length;i++){

            if(grades[i]<=100 & grades[i]>0){
                result =result+grades[i]+" ";

            }
            else {
                result +=" grades should be 0to100 ";

            }
        }
        return result;
    }
}



