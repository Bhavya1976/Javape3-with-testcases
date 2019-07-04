package main.test.com.stackroute.pe3;

import main.java.com.stackroute.pe3.StringException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringExceptionTest {

    StringException string;

    @Before
    public void setUp() {

        string = new StringException();
    }

    @After
    public void tearDown() {

        string = null;
    }


    @Test
    public void givenNumberShouldReturnStringExceptionMessage() {
        //arrange


        //act
       String result = string.firstException("");

        //assert
        assertEquals("this is not found bound to execute",result );
    }



}
