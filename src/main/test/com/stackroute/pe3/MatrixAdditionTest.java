package main.test.com.stackroute.pe3;

import main.java.com.stackroute.pe3.MatrixAddition;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;

public class MatrixAdditionTest {
    MatrixAddition add;
    int[][] expectedResult;
    int[][] actualResult;
    @Before
    public void setUp(){

        add=new MatrixAddition();
    }

    @After
    public void tearDown(){
        add=null;

    }

    @Test
    public void givenMultiDimensionalMatrixReturnsSum(){

        actualResult=add.matrixAddition();
         int[][] result={{-2,8,7},{10,8,6}};
        assertArrayEquals(result,actualResult);
    }



}