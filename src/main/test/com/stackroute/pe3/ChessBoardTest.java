package main.test.com.stackroute.pe3;

import main.java.com.stackroute.pe3.ChessBoardPattern;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChessBoardTest {




        ChessBoardPattern create;

        @Before
        public void setUp() {

            create = new ChessBoardPattern();
        }

        @After
        public void tearDown() {

            create = null;
        }


        @Test
        public void givenNumberShouldReturnAdditionOfMatrixMessage() {
            //arrange


            //act
            String result = create.printChessBoardPattern(8,8);

            //assert
            assertEquals(" ", result);
        }

}
