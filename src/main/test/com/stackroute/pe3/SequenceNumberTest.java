package main.test.com.stackroute.pe3;

import main.java.com.stackroute.pe3.SequenceNumber;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SequenceNumberTest {

    SequenceNumber sequence;

    @Before
    public void setUp() {

        sequence = new SequenceNumber();
    }

    @After
    public void tearDown() {

        sequence = null;
    }


    @Test
    public void givenNumberShouldReturnSequenceOfNumbersMessage() {
        //arrange


        //act
       int result[]= sequence.sequenceOfNumber();
        //assert
        assertEquals(sequence.sequenceOfNumber(), result);
    }

    @Test
    public void givenStringShouldReturnIndexOutOfRangeMessage() {
        //arrange

        //act
        int[] result= sequence.sequenceOfNumber();

        //assert
        assertEquals(sequence.sequenceOfNumber(), result);
    }


}
