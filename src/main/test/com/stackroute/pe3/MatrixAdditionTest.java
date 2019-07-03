package main.test.com.stackroute.pe3;

import org.junit.Before;


    import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import main.java.com.stackroute.pe3.MatrixAddition;

import static org.junit.Assert.*;

    public class MatrixAdditionTest {
        MatrixAddition add;

        @Before
        public void setUp() {

            add = new MatrixAddition();
        }

        @After
        public void tearDown() {

            add = null;
        }


        @Test
        public void givenNumberShouldReturnAdditionOfMatrixMessage() {
            //arrange


            //act
            int[][] result = add.matrixAddition(2,3);

            //assert
            assertEquals(" ", result);
        }

        @Test
        public void givenStringShouldReturnIndexOutOfRangeMessage() {
            //arrange

            //act
            int[][] result = add.matrixAddition(-1,9 );

            //assert
            assertEquals("Index Out Of Bound", result);
        }

        @Test
        public void givenStringShouldReturnAdditionWithZeroMatrixMessage() {
            //arrange

            //act
            int[][] result = add.matrixAddition(6,0 );

            //assert
            assertEquals("  ", result);


        }



    }
