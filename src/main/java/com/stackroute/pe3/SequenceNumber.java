package main.java.com.stackroute.pe3;

import java.util.Scanner;
 /* The function checks if the array elements are consecutive
       If elements are consecutive, then returns true, else returns
       false */

public class SequenceNumber {

    public boolean areConsecutive(int arr[], int n) {
        int min = arr[0];
        int max = arr[0];
        if (n < 1)
            return false;

        for (int i = 0; i < n-1; i++) {
            if (arr[i] < min)
                min = arr[i];
        }

        for (int i = 0; i < n-1; i++) {
            if (arr[i] > max)
                max = arr[i];
        }


        if (max - min + 1 == n) {

            boolean visited[] = new boolean[n];
            int i;
            for (i = 0; i < n; i++) {
                /* If we see an element again, then return false */
                if (visited[arr[i] - min] != false)
                    return false;

                visited[arr[i] - min] = true;
            }
            if (visited[arr[i]] == true) {
                System.out.println("Array elements are consecutive");
            } else {
                System.out.println("Array elements are not consecutive");
            }

            return true;
        }
        return true;
    }
}



