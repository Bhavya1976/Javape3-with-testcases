package main.java.com.stackroute.pe3;

import java.util.Scanner;
import java.lang.Class;


public class MatrixAddition {
    public static int[][] matrixAddition(int i,int j){
        int m, n;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of matrix");
        m = in.nextInt();
        n  = in.nextInt();

        int first[][] = new int[m][n];
        int second[][] = new int[m][n];
        int[][] sum = new int[m][n];

        System.out.println("Enter the elements of first matrix");

        for (i = 0; i < m; i++)
            for ( j= 0; j < n; j++)
                first[i][j] = in.nextInt();

        System.out.println("Enter the elements of second matrix");

        for (i = 0 ; i < m ; i++)
            for (j = 0 ; j < n ; j++)
                second[i][j] = in.nextInt();

        for (i = 0; i < m; i++)
            for (j = 0; j < n; j++)
                sum[i][j] = first[i][j] + second[i][j];  //replace '+' with '-' to subtract matrices

        System.out.println("Sum of the matrices:");

        for (i = 0; i < m; i++)
        {
            for (j = 0; j < n; j++)
                System.out.print(sum[i][j]+"\t");

            System.out.println();
        }
        return sum;
    }

}




