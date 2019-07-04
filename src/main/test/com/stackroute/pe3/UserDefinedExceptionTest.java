package main.test.com.stackroute.pe3;

import main.java.com.stackroute.pe3.UserDefinedException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserDefinedExceptionTest {
  UserDefinedException defined;

    @Before
    public void setUp() {

      defined = new UserDefinedException();
    }

    @After
    public void tearDown() {

        defined = null;
    }


    @Test
    public void givenNumberShouldReturnNullPointerExceptionMessage() {
        //arrange


        //act
        String result =defined.userException("NullPointerException caught");

        //assert
        assertEquals("ArrayIndexOutOfBoundsException Exception caught.", result);
    }






}
