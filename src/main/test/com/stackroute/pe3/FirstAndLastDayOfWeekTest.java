package main.test.com.stackroute.pe3;

import main.java.com.stackroute.pe3.FirstAndLastDayOfWeek;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstAndLastDayOfWeekTest {

    FirstAndLastDayOfWeek day;

    @Before
    public void setUp() {
        day = new FirstAndLastDayOfWeek();
    }

    @After
    public void tearDown(){

        day = null;
    }
    @Test
    public void givenInputShouldReturnFirstAndLastDay(){
        String result=day.firstAndLastDayOfWeek();
        assertEquals("Mon 01/07/2019\n" +
                "Sun 07/07/2019",result);
    }

}
