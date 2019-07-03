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


}
