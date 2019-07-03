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
    public void givenGradesShouldReturnStudentGrades() {
//        arrange



        int[] actual = marks.studentMarksCalculation(2, new int[] {30,60});

        assertEquals("30,60 ", actual);


    }
    //
    @Test
    public void givenGradesShouldReturnException() {
//        arrange


        int[] actual = marks.studentMarksCalculation(2, new int[] {110,160});

        assertEquals("number out of range exception ", actual);
    }
}
