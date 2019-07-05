package main.test.com.stackroute.pe3;

import main.java.com.stackroute.pe3.StudentMarks;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentMarksTest {
  StudentMarks marks;

    @Before
    public void setUp() {

        marks = new StudentMarks();
    }

    @After
    public void tearDown() {

        marks = null;
    }



    @Test
    public void givenStudentGradesAsInputs(){
        String result=StudentMarks.studentMarksDisplay(new int[] {40,50,60,70});
        assertEquals("40 50 60 70 ",result);

    }
    @Test
    public void givenStudentGradesIsGraterThan100PrintErrMsg(){
        String result=StudentMarks.studentMarksDisplay(new int[] {40,50,60,170});
        assertEquals("40 50 60  grades should be 0to100 ",result);

    }
    @Test
    public void givenStudentGradesIslessthanZeroPrintErrMsg(){
        String result=StudentMarks.studentMarksDisplay(new int[] {-40,50,60,170});
        assertEquals(" grades should be 0to100 50 60  grades should be 0to100 ",result);

    }


}
