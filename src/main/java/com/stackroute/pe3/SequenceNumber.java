package main.java.com.stackroute.pe3;

public class SequenceNumber {
    public static String sequenceOfNumber(int number[]){
        boolean b = true;
        int size = number.length;
        String string = " ";
        for (int i = 0; i < size; i++) {
            if (number[i + 1] - number[i] == 1) {

            } else
                b = false;
        }
        if (b) {
            for (int i = 0; i <= size; i++) {
                string = string + number[i] + ",";
            }

            return string + " are consecutive";

        } else {
            for (int i = 0; i <= size; i++) {
                if (i == size) {
                    string = string + number[i];
                } else
                    string = string + number[i] + ",";
            }
            return string + " are not consecutive";
        }
    }
}
